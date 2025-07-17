package milktea;

public class LycheeJelly implements MenuItem {
    private MenuItem beverage;

    public LycheeJelly(MenuItem beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", with lychee jelly";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.90;
    }

    @Override
    public MenuItem getWrappedObject() {
        return beverage;
    }
}
