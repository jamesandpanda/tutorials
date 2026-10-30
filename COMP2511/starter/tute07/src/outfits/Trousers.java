package outfits;

public class Trousers extends Pants {
    public Trousers() {
        super("Merino Wool", 100);
    }

    @Override
    public String toString() {
        return "Trousers, material: " + getMaterial() + ", cost: $" + getCost();
    }
}
