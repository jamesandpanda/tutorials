package milktea;

public class MilkFoamDecorator implements Beverage {
    private Beverage milkTea;

    public MilkFoamDecorator(Beverage milkTea) {
        this.milkTea = milkTea;
    }

    @Override
    public String getDescription() {
        return milkTea.getDescription() + ", milk foam";
    }

    @Override
    public double getCost() {
        return milkTea.getCost() + 1.0;
    }

    @Override
    public Beverage removeTopping() {
        return milkTea;
    }
}
