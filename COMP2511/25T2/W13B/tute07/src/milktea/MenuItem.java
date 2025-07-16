package milktea;

public interface MenuItem {
    public String getDescription();

    public double getCost();
    
    public MenuItem getOriginalBeverage();
}
