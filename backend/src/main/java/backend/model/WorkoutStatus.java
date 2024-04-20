package backend.model;

// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;

@Entity
public class WorkoutStatus {

    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private double distanceRan;
    private int pushupsCompleted;
    private double weightLifted;

    // Constructors
    public WorkoutStatus() {
        // Default constructor
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDistanceRan() {
        return distanceRan;
    }

    public void setDistanceRan(double distanceRan) {
        this.distanceRan = distanceRan;
    }

    public int getPushupsCompleted() {
        return pushupsCompleted;
    }

    public void setPushupsCompleted(int pushupsCompleted) {
        this.pushupsCompleted = pushupsCompleted;
    }

    public double getWeightLifted() {
        return weightLifted;
    }

    public void setWeightLifted(double weightLifted) {
        this.weightLifted = weightLifted;
    }

    // You can add other methods as needed
}
