package pokemon2;

import java.util.Scanner;

public class PokemonLab {
    private static PokemonFactory f;

    public static void main(String[] args) {
        System.out.println("Are you from Kanto or Johto?");
        Scanner sc = new Scanner(System.in);
        String region = sc.nextLine();

        switch (region) {
            case "Kanto":
                f = new KantoPokemonFactory(); break;
            case "Johto":
                f = new JohtoPokemonFactory(); break;
            default:
                sc.close();
                throw new IllegalArgumentException("Invalid region");
        }

        System.out.println("Would you like to choose the Grass, Fire or Water type Pokemon?");
        String type = sc.nextLine();
        sc.close();

        Pokemon p;
        switch (type) {
            case "Grass":
                p = f.getGrass(); break;
            case "Fire":
                p = f.getFire(); break;
            case "Water":
                p = f.getWater(); break;
            default:
                throw new IllegalArgumentException("Unknown Pokemon");
        }

        System.out.println("You chose the " + type + " type Pokemon, " + p.toString()
            + "! " + p.toString() + " has the " + p.getNature().toString() + " nature.");
    }
}
