package icecream;

public class VanillaIceCream extends IceCream {
    @Override
    public String getDescription() {
        return "Ice Cream Cone with Vanilla Scoop";
    }

    @Override
    public double getCost() {
        return 4.70;
    }
}
