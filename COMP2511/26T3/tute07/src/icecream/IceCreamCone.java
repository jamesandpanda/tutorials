package icecream;

public class IceCreamCone implements IceCream {
    private String description;
    private double cost = 0.5;

    @Override
    public String getDescription() {
        return "Ice cream cone";
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public IceCream removeDecorator() {
        return this;
    }
}
