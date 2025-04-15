package computer;

public class Computer implements ComputerComponent {
    private String name;
    private int storage;
    private int ram;

    public Computer(String name, int storage, int ram) {
        this.name = name;
        this.storage = storage;
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public int getRam() {
        return ram;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(ComputerVisitor visitor) {
        visitor.visit(this);
    }
}
