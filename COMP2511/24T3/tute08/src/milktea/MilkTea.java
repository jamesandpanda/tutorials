package milktea;

public class MilkTea implements Beverage {
    @Override
    public String getDescription() {
        return "Milk Tea";
    }

    @Override
    public double getCost() {
        return 6.0;
    }

    @Override
    public Beverage removeTopping() {
        return this;
    }
}
