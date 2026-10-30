package icecream;

public class ChocolateScoop extends IceCream {
    private IceCream wrapped;

    public ChocolateScoop(IceCream wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public String getDescription() {
        return wrapped.getDescription() + ", with a chocolate scoop";
    }

    @Override
    public double getCost() {
        return wrapped.getCost() + 5.00;
    }
}
