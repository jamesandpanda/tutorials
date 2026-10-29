package icecream;

public class VanillaScoop implements IceCream {
    private IceCream iceCream;

    public VanillaScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", with a vanilla scoop";
    }

    @Override
    public double getCost() {
        return iceCream.getCost() + 4;
    }

    @Override
    public IceCream removeDecorator() {
        return iceCream;
    }
}
