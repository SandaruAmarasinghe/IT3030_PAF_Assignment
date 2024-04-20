package backend.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import backend.model.Media;
import backend.repository.MediaRepository;

@RestController
@RequestMapping("/api/media")
public class MediaController {

      @Autowired
      private MediaRepository mediaRepository;

      @PostMapping("/upload")
      public ResponseEntity<String> uploadMedia(@RequestParam("file") MultipartFile file,
                  @RequestParam("description") String description) {
            if (file.isEmpty()) {
                  return ResponseEntity.badRequest().body("Please select a file to upload");
            }

           
            String contentType = file.getContentType();
            if (!contentType.startsWith("image/") && !contentType.startsWith("video/")) {
                  return ResponseEntity.badRequest().body("Only image or video files are allowed");
            }

            if (file.getSize() > 30 * 1024 * 1024) { // Max size: 30 MB
                  return ResponseEntity.badRequest().body("File size exceeds the limit (30MB)");
            }

            try {
                  // Save file to 'uploads' folder
                  String fileName = file.getOriginalFilename();
                  assert fileName != null;
                  String filePath = "uploads/" + fileName;
                  file.transferTo(new java.io.File(filePath));

                  // Save file metadata to database
                  Media media = new Media(fileName, description, filePath);
                  mediaRepository.save(media);

                  return ResponseEntity.ok("File uploaded successfully");
            } catch (IOException e) {
                  e.printStackTrace();
                  return ResponseEntity.status(500).body("Failed to upload file");
            }
      }
}
