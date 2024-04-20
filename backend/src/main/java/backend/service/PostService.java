package backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.repository.PostRepository;

// @Service
// public class UserService {

//     private final UserRepository userRepository;

//     @Autowired
//     public UserService(UserRepository userRepository) {
//         this.userRepository = userRepository;
//     }

//     public UserDetails loadUserByUsername(String username) {
//         throw new UnsupportedOperationException("Unimplemented method 'loadUserByUsername'");
//     }

//     public UserRepository getUserRepository() {
//         return userRepository;
//     }
// }

// PostService.java
@SuppressWarnings("unused")
@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;
}
