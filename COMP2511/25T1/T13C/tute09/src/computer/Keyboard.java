package computer;

public class Keyboard {
    private String name;
    private int numKeys = 36;

    public Keyboard(String name) {
        this.name = name;
    }

    public int getNumKeys() {
        return numKeys;
    }

    public String getName() {
        return name;
    }
}
