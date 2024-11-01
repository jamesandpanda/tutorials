package milktea;

public interface Beverage {
    public String getDescription();

    public double getCost();

    public Beverage removeTopping();
}