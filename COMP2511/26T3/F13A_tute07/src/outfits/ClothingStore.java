package outfits;

import java.util.Scanner;

public class ClothingStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Welcome! What type of outfit are you looking for? (casual|formal): ");
        String line = sc.nextLine().toLowerCase();

        ClothingFactory factory;
        switch (line) {
            case "casual":
                factory = new CasualClothingFactory();
                break;
            case "formal":
                factory = new FormalClothingFactory();
                break;
            default:
                sc.close();
                throw new IllegalArgumentException("Unknown outfit type.");
        }

        Shirt s = factory.createShirt();
        Pants p = factory.createPants();
        System.out.println("I recommend these pieces: " + s.toString() + " and " + p.toString());

        sc.close();
    }
    
}
