package milktea;

public class MilkTea implements MenuItem {
    public String getDescription() {
        return "Milk Tea";
    }

    public double getCost() {
        return 6.0;
    }

    @Override
    public MenuItem getWrappedObject() {
        return this;
    }
}
