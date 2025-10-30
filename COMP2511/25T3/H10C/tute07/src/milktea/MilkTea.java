package milktea;

public class MilkTea implements MenuItem {
    @Override
    public String getDescription() {
        return "Milk Tea";
    }

    @Override
    public double getCost() {
        return 6.0;
    }

    @Override
    public MenuItem removeTopping() {
        return this;
    }
}
