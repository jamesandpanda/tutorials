package icecream;

public class VanillaScoop extends IceCream {
    private IceCream wrapped;

    public VanillaScoop(IceCream wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public String getDescription() {
        return wrapped.getDescription() + ", with a vanilla scoop";
    }

    @Override
    public double getCost() {
        return wrapped.getCost() + 4.00;
    }
}