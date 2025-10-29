package milktea;

public class Pearls implements MenuItem {
    private MenuItem wrapped;

    public Pearls(MenuItem wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public String getDescription() {
        return wrapped.getDescription() + ", with pearls";
    }

    @Override
    public double getCost() {
        return wrapped.getCost() + 0.8;
    }
}
