package backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.model.WorkoutPlan;
import backend.repository.WorkoutPlanRepository;

@Service
public class WorkoutPlanService {

      private final WorkoutPlanRepository workoutPlanRepository;

      @Autowired
      public WorkoutPlanService(WorkoutPlanRepository workoutPlanRepository) {
            this.workoutPlanRepository = workoutPlanRepository;
      }

      public Object createWorkoutPlan(WorkoutPlan workoutPlan) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'createWorkoutPlan'");
      }

      // Service methods to handle CRUD operations and other business logic
}
