package backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.model.Media;

public interface MediaRepository extends JpaRepository<Media, Long> {
    // You can define custom query methods here if needed
}
