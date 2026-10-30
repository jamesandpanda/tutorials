package outfits;

public class Pants {
    private String material;
    private double cost;

    public Pants(String material, double cost) {
        this.material = material;
        this.cost = cost;
    }

    public String getMaterial() {
        return material;
    }

    public double getCost() {
        return cost;
    }
}
