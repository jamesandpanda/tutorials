package pokemon2;

import java.util.Random;

import pokemon2.kanto.*;

// This factory constructs the appropriate Grass/Water/Fire type Pokemon, which
// are all from Kanto.
public class KantoPokemonFactory implements PokemonFactory {
    @Override
    public Pokemon getGrass() {
        Nature n = Nature.values()[new Random().nextInt(Nature.values().length)];
        return new Bulbasaur(n);
    }

    @Override
    public Pokemon getWater() {
        Nature n = Nature.values()[new Random().nextInt(Nature.values().length)];
        return new Squirtle(n);
    }

    @Override
    public Pokemon getFire() {
        Nature n = Nature.values()[new Random().nextInt(Nature.values().length)];
        return new Charmander(n);
    }
}
