package cafe;

public class MilkFoam implements MenuItem {
    private MenuItem wrappee;

    public MilkFoam(MenuItem wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public String getDescription() {
        return wrappee.getDescription() + ", Milk Foam";
    }

    @Override
    public double getCost() {
        return wrappee.getCost() + 1.00;
    }
}
