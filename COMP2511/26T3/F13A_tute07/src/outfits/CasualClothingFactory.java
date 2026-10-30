package outfits;

public class CasualClothingFactory implements ClothingFactory {
    @Override
    public Shirt createShirt() {
        return new TShirt();
    }

    @Override
    public Pants createPants() {
        return new Jeans();
    }
}
