package encapsulation.assignment_problems;

public class TrafficLight {
    private final String id;
    private String color;

    public TrafficLight(String id) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("ID cannot be blank.");
        }

        this.id = id;
        this.color = "RED";
    }

    public void next() {
        switch (color) {
            case "RED":
                color = "GREEN";
                break;
            case "GREEN":
                color = "YELLOW";
                break;
            default:
                color = "RED";
        }
    }

    public String getColor() {
        return color;
    }

    public String getId() {
        return id;
    }
}