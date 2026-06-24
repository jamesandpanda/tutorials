package restaurant;

public class Meal {
    private String name;
    private double cost;

    public Meal(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }
}
