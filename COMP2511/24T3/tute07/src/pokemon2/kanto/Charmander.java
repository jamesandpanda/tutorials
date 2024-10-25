package pokemon2.kanto;

import pokemon2.Nature;
import pokemon2.Pokemon;

// A Fire type Pokemon from Kanto.
public class Charmander extends Pokemon {
    public Charmander(Nature nature) {
        super(nature);
    }

    @Override
    public String toString() {
        return "Charmander";
    }
}