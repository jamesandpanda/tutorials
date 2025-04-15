package computer;

public class Mouse implements ComputerComponent {
    private String name;
    private int dpi;

    public Mouse(String name, int dpi) {
        this.name = name;
        this.dpi = dpi;
    }

    public int getDpi() {
        return dpi;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(ComputerVisitor visitor) {
        visitor.visit(this);
    }
}
