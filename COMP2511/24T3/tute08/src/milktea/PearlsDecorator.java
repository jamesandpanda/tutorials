package milktea;

public class PearlsDecorator implements Beverage {
    private Beverage milkTea;

    public PearlsDecorator(Beverage milkTea) {
        this.milkTea = milkTea;
    }

    @Override
    public String getDescription() {
        return milkTea.getDescription() + ", pearls";
    }

    @Override
    public double getCost() {
        return milkTea.getCost() + 0.8;
    }

    @Override
    public Beverage removeTopping() {
        return milkTea;
    }
}