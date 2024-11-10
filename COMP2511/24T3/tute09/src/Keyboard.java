public class Keyboard implements ComputerComponent {
    private String name;
    private int numKeys = 36;

    public Keyboard(String name) {
        this.name = name;
    }

    public int getNumKeys() {
        return numKeys;
    }

    public void setNumKeys(int numKeys) {
        this.numKeys = numKeys;
    }

    @Override
    public String toString() {
        return name;
    }

    // Each class that accepts a visitor will need this method. This unfortunately requires you
    // to modify the classes to be visited, but this change is at least trivial and simply calls
    // the appropriate visit method.
    @Override
    public void accept(ComputerVisitor visitor) {
        visitor.visitKeyboard(this);
    }
}
