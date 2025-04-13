package cafe;

public class LycheeJelly implements MenuItem {
    private MenuItem wrappee;

    public LycheeJelly(MenuItem wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public String getDescription() {
        return wrappee.getDescription() + ", Lychee Jelly";
    }

    @Override
    public double getCost() {
        return wrappee.getCost() + 0.90;
    }
}
