// Remember: The purpose of the visitor pattern is to implement an algorithm that is completely
// separate from the classes being operated on.
// This is similar to the Decorator pattern, where functionality is added on top of an existing class
// without modifying it, by 'wrapping' the object around decorators which extend its functionality.
public class ComputerVisitor {
    private boolean isValidated = false;

    public static void main(String[] args) {
        ComputerComponent computer = new Computer("Corelli", 500);
        ComputerComponent keyboard = new Keyboard("Mechanical keyboard");
        ComputerComponent mouse = new Mouse("Bluetooth mouse");
        ComputerVisitor visitor = new ComputerVisitor();

        // This should fail, since the visitor has not been 'validated' yet and computers cannot
        // accept unvalidated visitors.
        computer.accept(visitor);

        visitor.validate();
        computer.accept(visitor);
        keyboard.accept(visitor);
        mouse.accept(visitor);
    }

    public boolean isValidated() {
        return isValidated;
    }

    public void validate() {
        isValidated = true;
    }

    // Visitors should have a method that takes in the concrete type of what they actually want
    // to visit (each type needs a corresponding method to accept a visitor).
    // This is done to prevent the need to typecast. Imagine if the visit method accepted any
    // type of ComputerComponent!
    // The logic done upon visiting each component is done in the appropriate methods here.
    public void visitComputer(Computer c) {
        System.out.println(String.format("Looking at computer %s with memory %d GB.", c, c.getMemory()));
    }

    public void visitKeyboard(Keyboard k) {
        System.out.println(String.format("Looking at keyboard %s which has %d keys.", k, k.getNumKeys()));
    }

    public void visitMouse(Mouse m) {
        System.out.println(String.format("Looking at mouse %s.", m));
    }
}
