package trains;

public abstract class Wagon {
    private String type;

    public Wagon(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
