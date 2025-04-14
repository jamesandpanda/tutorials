package cafe;

public class MilkTea implements MenuItem {
    @Override
    public String getDescription() {
        return "Milk Tea";
    }

    @Override
    public double getCost() {
        return 6.0;
    }
}
