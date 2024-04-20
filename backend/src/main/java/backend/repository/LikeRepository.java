package backend.repository;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository; 

@Repository
public interface LikeRepository extends JpaRepository<Like, Long> {
    // Add custom queries if needed

    // Example of custom query to find likes by user
    List<Like> findByUser(User user);
}
