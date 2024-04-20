package backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.repository.LikeRepository;

// LikeService.java
@Service
public class LikeService {
    @Autowired
    private LikeRepository likeRepository;
    // implement service methods
}