package outfits;

public class TShirt extends Shirt {
    public TShirt() {
        super("Cotton/Polyester Blend", 30);
    }

    @Override
    public String toString() {
        return "T-Shirt, material: " + getMaterial() + ", cost: $" + getCost();
    }
}
