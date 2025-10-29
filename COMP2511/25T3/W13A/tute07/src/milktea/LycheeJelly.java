package milktea;

public class LycheeJelly implements MenuItem {
    private MenuItem wrapped;

    public LycheeJelly(MenuItem wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public String getDescription() {
        return wrapped.getDescription() + ", with lychee jelly";
    }

    @Override
    public double getCost() {
        return wrapped.getCost() + 0.9;
    }
}
