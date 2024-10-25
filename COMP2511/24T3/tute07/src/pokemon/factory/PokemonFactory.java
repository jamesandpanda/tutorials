package pokemon.factory;

import java.util.Random;

import pokemon.*;

// We abstract away the construction of these objects through this factory class.
public class PokemonFactory {
    public static Pokemon createPokemon(String type) {
        Nature n = Nature.values()[new Random().nextInt(Nature.values().length)];

        switch (type) {
            case "Grass":
                return new Bulbasaur(n);
            case "Water":
                return new Squirtle(n);
            case "Fire":
                return new Charmander(n);
            default:
                throw new IllegalArgumentException("Unknown Pokemon");
        }
    }
}
