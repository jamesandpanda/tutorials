package pokemon;

import java.util.Scanner;

import pokemon.factory.PokemonFactory;

public class PokemonLab {
    public static void main(String[] args) {
        System.out.println("Would you like to choose the Grass, Fire or Water type Pokemon?");
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        sc.close();

        // We call on the method defined in the factory to construct a Pokemon,
        // rather than calling the concrete constructors ourselves.
        // While construction is simple in this example, imagine if construction
        // was very difficult! The motivation behind this example would make more sense.
        Pokemon p = PokemonFactory.createPokemon(type);

        // Printing will implicitly call .toString(), so it is unnecessary.
        System.out.println("You chose the " + type + " type Pokemon, " + p + "! "
            + p + " has the " + p.getNature() + " nature.");
    }
}
