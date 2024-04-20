package backend.model;

// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;

@Entity
public class Media {

      @Id
      // @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;

      private String fileName;
      private String description;
      private String filePath;

      public Media() {
            // Default constructor required by JPA
      }

      public Media(String fileName, String description, String filePath) {
            this.fileName = fileName;
            this.description = description;
            this.filePath = filePath;
      }

      public Long getId() {
            return id;
      }

      public void setId(Long id) {
            this.id = id;
      }

      public String getFileName() {
            return fileName;
      }

      public void setFileName(String fileName) {
            this.fileName = fileName;
      }

      public String getDescription() {
            return description;
      }

      public void setDescription(String description) {
            this.description = description;
      }

      public String getFilePath() {
            return filePath;
      }

      public void setFilePath(String filePath) {
            this.filePath = filePath;
      }
}
