package outfits;

public class OxfordShirt extends Shirt {
    public OxfordShirt() {
        super("Cotton", 60);
    }

    @Override
    public String toString() {
        return "Oxford Shirt, material: " + getMaterial() + ", cost: $" + getCost();
    }
}
