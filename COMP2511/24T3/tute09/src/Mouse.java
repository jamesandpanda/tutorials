public class Mouse implements ComputerComponent {
    private String name;

    public Mouse(String name) {
        this.name = name;
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
        visitor.visitMouse(this);
    }
}
