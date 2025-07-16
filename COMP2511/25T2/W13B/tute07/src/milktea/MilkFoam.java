package milktea;

public class MilkFoam implements MenuItem {
    private MenuItem beverage;

    public MilkFoam(MenuItem beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", with milk foam";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 1.00;
    }

    @Override
    public MenuItem getOriginalBeverage() {
        return beverage;
    }
}
