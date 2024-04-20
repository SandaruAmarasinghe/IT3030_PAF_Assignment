package backend.model;

// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;

@Entity
public class WorkoutPlan {

      @Id
      // @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;

      private String name;
      private String description;
      private String routines;
      private String exercises;
      private int sets;
      private int repetitions;

      // Constructors, getters, and setters
}
