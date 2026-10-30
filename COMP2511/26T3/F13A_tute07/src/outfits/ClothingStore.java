package outfits;

import java.util.Scanner;

public class ClothingStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Welcome! What type of outfit are you looking for? (casual|formal): ");
        String line = sc.nextLine().toLowerCase();

        switch (line) {
            case "casual":
                TShirt tShirt = new TShirt();
                Trousers trousers = new Trousers(); // mismatched
                System.out.println("I recommend these pieces: " + tShirt.toString() + " and " + trousers.toString());
                break;
            case "formal":
                OxfordShirt oxfordShirt = new OxfordShirt();
                Jeans jeans = new Jeans(); // mismatched
                System.out.println("I recommend these pieces: " + oxfordShirt.toString() + " and " + jeans.toString());
                break;
            default:
                sc.close();
                throw new IllegalArgumentException("Unknown outfit type.");
        }

        sc.close();
    }
    
}
