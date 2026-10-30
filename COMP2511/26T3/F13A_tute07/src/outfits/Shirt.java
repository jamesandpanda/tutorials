package outfits;

public abstract class Shirt {
    private String material;
    private double cost;

    public Shirt(String material, double cost) {
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
