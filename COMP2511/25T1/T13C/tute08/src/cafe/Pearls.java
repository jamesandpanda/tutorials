package cafe;

public class Pearls implements MenuItem {
    private MenuItem wrappee;

    public Pearls(MenuItem wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public String getDescription() {
        return wrappee.getDescription() + ", Pearls";
    }

    @Override
    public double getCost() {
        return wrappee.getCost() + 0.80;
    }
}
