package outfits;

public class FormalClothingFactory implements ClothingFactory {
    @Override
    public Shirt createShirt() {
        return new OxfordShirt();
    }

    @Override
    public Pants createPants() {
        return new Trousers();
    }
}
