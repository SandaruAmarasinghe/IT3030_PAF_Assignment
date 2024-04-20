package backend.repository;

import java.util.List; // Import List from java.util package

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
      // Add custom queries if needed

      // Example of custom query to find comments by post
      List<Comment> findByPost(Post post);
}
