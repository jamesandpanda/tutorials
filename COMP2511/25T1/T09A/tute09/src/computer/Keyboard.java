package computer;

public class Keyboard implements ComputerComponent {
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

    @Override
    public void accept(ComputerVisitor visitor) {
        visitor.visit(this);
    }
}
