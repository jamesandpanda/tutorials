public interface ComputerComponent {
    // Each component should have a method to accept a visitor.
    public void accept(ComputerVisitor visitor);
}
