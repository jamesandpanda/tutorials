package icecream;

public class StrawberryScoop extends IceCream {
    private IceCream wrapped;

    public StrawberryScoop(IceCream wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public String getDescription() {
        return wrapped.getDescription() + ", with a strawberry scoop";
    }

    @Override
    public double getCost() {
        return wrapped.getCost() + 4.50;
    }
}
