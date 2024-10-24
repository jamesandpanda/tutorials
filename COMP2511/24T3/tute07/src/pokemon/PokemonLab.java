package pokemon;

import java.util.Random;
import java.util.Scanner;

public class PokemonLab {
    public static void main(String[] args) {
        System.out.println("Would you like to choose the Grass, Fire or Water type Pokemon?");
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        sc.close();

        int r = new Random().nextInt(Nature.values().length);
        Pokemon p;
        switch (type) {
        case "Grass":
            p = new Bulbasaur(Nature.values()[r]); break;
        case "Fire":
            p = new Charmander(Nature.values()[r]); break;
        case "Water":
            p = new Squirtle(Nature.values()[r]); break;
        default:
            throw new IllegalArgumentException("Unknown Pokemon");
        }

        System.out.println("You chose the " + type + " type Pokemon, " + p.toString()
            + "! " + p.toString() + " has the " + p.getNature().toString() + " nature.");
    }
}
