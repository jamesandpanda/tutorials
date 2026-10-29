package icecream;

public class ChocolateScoop implements IceCream {
    private IceCream iceCream;

    public ChocolateScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", with a chocolate scoop";
    }

    @Override
    public double getCost() {
        return iceCream.getCost() + 3.50;
    }

    @Override
    public IceCream removeDecorator() {
        return iceCream;
    }
}
