package pokemon2.kanto;

import pokemon2.Nature;
import pokemon2.Pokemon;

// A Grass type Pokemon from Kanto.
public class Bulbasaur extends Pokemon {
    public Bulbasaur(Nature nature) {
        super(nature);
    }

    @Override
    public String toString() {
        return "Bulbasaur";
    }
}
