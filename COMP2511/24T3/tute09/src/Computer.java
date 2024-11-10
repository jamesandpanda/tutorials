public class Computer implements ComputerComponent {
    private String name;
    private int memory;

    public Computer(String name, int memory) {
        this.name = name;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return name;
    }

    public int getMemory() {
        return memory;
    }

    // Each class that accepts a visitor will need this method. This unfortunately requires you
    // to modify the classes to be visited, but the logic to be added should be trivial.
    @Override
    public void accept(ComputerVisitor visitor) {
        if (visitor.isValidated()) {
            visitor.visitComputer(this);
        } else {
            System.out.println("Visitor needs to be validated!");
        }
    }
}
