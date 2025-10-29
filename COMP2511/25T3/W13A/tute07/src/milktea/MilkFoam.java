package milktea;

public class MilkFoam implements MenuItem {
    private MenuItem wrapped;

    public MilkFoam(MenuItem wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public String getDescription() {
        return wrapped.getDescription() + ", with milk foam";
    }

    @Override
    public double getCost() {
        return wrapped.getCost() + 1.0;
    }
}
