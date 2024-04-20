package backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backend.model.WorkoutPlan;
import backend.service.WorkoutPlanService;

@RestController
@RequestMapping("/api/workout-plans")
public class WorkoutPlanController {

      private final WorkoutPlanService workoutPlanService;

      @Autowired
      public WorkoutPlanController(WorkoutPlanService workoutPlanService) {
            this.workoutPlanService = workoutPlanService;
      }

      @PostMapping
      public ResponseEntity<Object> createWorkoutPlan(@RequestBody WorkoutPlan workoutPlan) {
            if (workoutPlan == null) {
                  return ResponseEntity.badRequest().build(); // Return bad request status if workoutPlan is null
            }
            return ResponseEntity.ok(workoutPlanService.createWorkoutPlan(workoutPlan));
      }


}
