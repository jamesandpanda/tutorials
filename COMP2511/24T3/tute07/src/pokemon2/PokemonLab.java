package pokemon2;

import java.util.Random;
import java.util.Scanner;

import pokemon2.johto.Chikorita;
import pokemon2.johto.Cyndaquil;
import pokemon2.johto.Totodile;
import pokemon2.kanto.*;

public class PokemonLab {
    public static void main(String[] args) {
        System.out.println("Are you from Kanto or Johto?");
        Scanner sc = new Scanner(System.in);
        String region = sc.nextLine();

        System.out.println("Would you like to choose the Grass, Fire or Water type Pokemon?");
        String type = sc.nextLine();
        sc.close();

        int r = new Random().nextInt(Nature.values().length);
        Pokemon p;
        switch (region) {
            case "Kanto":
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
            break;

            case "Johto":
            switch (type) {
                case "Grass":
                    p = new Chikorita(Nature.values()[r]); break;
                case "Fire":
                    p = new Cyndaquil(Nature.values()[r]); break;
                case "Water":
                    p = new Totodile(Nature.values()[r]); break;
                default:
                    throw new IllegalArgumentException("Unknown Pokemon");
            }
            break;

            default:
                throw new IllegalArgumentException("Unknown Pokemon");
        }

        System.out.println("You chose the " + type + " type Pokemon, " + p.toString()
            + "! " + p.toString() + " has the " + p.getNature().toString() + " nature.");
    }
}
