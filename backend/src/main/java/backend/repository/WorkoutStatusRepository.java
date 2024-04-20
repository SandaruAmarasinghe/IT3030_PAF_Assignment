package backend.repository;

import org.springframework.stereotype.Repository;

import backend.model.WorkoutStatus;

@Repository
public interface WorkoutStatusRepository extends JpaRepository<WorkoutStatus, Long> {
    // Define any additional methods if needed
}
