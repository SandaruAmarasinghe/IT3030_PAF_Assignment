package backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import backend.model.WorkoutStatus;
import backend.repository.WorkoutStatusRepository;

@RestController
@RequestMapping("/workout")
public class WorkoutStatusController {

    @Autowired
    private WorkoutStatusRepository workoutStatusRepository;

    @PostMapping("/update")
    public void updateWorkoutStatus(@RequestBody WorkoutStatus workoutStatus) {
        // Your code for updating workout status
    }

    @GetMapping("/all")
    public List<WorkoutStatus> getAllWorkoutStatus() {
        return null;
        // Your code for getting all workout status
    }
}
