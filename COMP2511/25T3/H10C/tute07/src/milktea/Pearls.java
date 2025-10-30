package milktea;

public class Pearls implements MenuItem {
    private MenuItem beverage;

    public Pearls(MenuItem beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", with pearls";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.8;
    }

    @Override
    public MenuItem removeTopping() {
        return beverage;
    }
}
