package icecream;

public class StrawberryScoop implements IceCream {
    private IceCream iceCream;

    public StrawberryScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", with a strawberry scoop";
    }

    @Override
    public double getCost() {
        return iceCream.getCost() + 3;
    }

    @Override
    public IceCream removeDecorator() {
        return iceCream;
    }
}
