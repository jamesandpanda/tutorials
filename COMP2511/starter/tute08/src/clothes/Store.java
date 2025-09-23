package clothes;

import java.util.Scanner;

import clothes.small.*;
import clothes.medium.*;
import clothes.large.*;

public class Store {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("* Welcome to the 2511 Clothes Store! *");

        System.out.print("What size of clothing would you like to buy? (s/m/l): ");
        String size = s.nextLine();

        System.out.print("What item would you like to buy? (shirt/jeans/jacket): ");
        String item = s.nextLine();
        s.close();

        ClothingItem c = switch (size) {
            case "s": {
                switch (item) {
                    case "shirt": yield new SmallShirt();
                    case "jeans": yield new SmallJeans();
                    case "jacket": yield new SmallJacket();
                    default: throw new IllegalArgumentException("Invalid clothing item");
                }
            }
            case "m": {
                switch (item) {
                    case "shirt": yield new MediumShirt();
                    case "jeans": yield new MediumJeans();
                    case "jacket": yield new MediumJacket();
                    default: throw new IllegalArgumentException("Invalid clothing item");
                }
            }
            case "l": {
                switch (item) {
                    case "shirt": yield new LargeShirt();
                    case "jeans": yield new LargeJeans();
                    case "jacket": yield new LargeJacket();
                    default: throw new IllegalArgumentException("Invalid clothing item");
                }
            }
            default: throw new IllegalArgumentException("Invalid size");
        };

        System.out.println("Ordered a " + c);
        System.out.println("Cost: $" + c.getCost());
    }
}
