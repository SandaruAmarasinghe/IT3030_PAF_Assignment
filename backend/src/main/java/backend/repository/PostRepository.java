package backend.repository;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository; 

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
 
    List<Post> findByAuthor(User author);
}
