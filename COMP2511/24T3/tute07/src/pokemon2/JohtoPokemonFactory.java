package pokemon2;

import java.util.Random;

import pokemon2.johto.*;

// This factory constructs the appropriate Grass/Water/Fire type Pokemon, which
// are all from Johto.
public class JohtoPokemonFactory implements PokemonFactory {
    @Override
    public Pokemon getGrass() {
        Nature n = Nature.values()[new Random().nextInt(Nature.values().length)];
        return new Chikorita(n);
    }

    @Override
    public Pokemon getWater() {
        Nature n = Nature.values()[new Random().nextInt(Nature.values().length)];
        return new Totodile(n);
    }

    @Override
    public Pokemon getFire() {
        Nature n = Nature.values()[new Random().nextInt(Nature.values().length)];
        return new Cyndaquil(n);
    }
}
