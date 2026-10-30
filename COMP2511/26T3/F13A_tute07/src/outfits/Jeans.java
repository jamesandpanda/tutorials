package outfits;

public class Jeans extends Pants {
    public Jeans() {
        super("Denim", 60);
    }

    @Override
    public String toString() {
        return "Jeans, material: " + getMaterial() + ", cost: $" + getCost();
    }
}
