package milktea;

public class LycheeJellyDecorator implements Beverage {
    private Beverage milkTea;

    public LycheeJellyDecorator(Beverage milkTea) {
        this.milkTea = milkTea;
    }

    @Override
    public String getDescription() {
        return milkTea.getDescription() + ", lychee jelly";
    }

    @Override
    public double getCost() {
        return milkTea.getCost() + 0.9;
    }

    @Override
    public Beverage removeTopping() {
        return milkTea;
    }
}
