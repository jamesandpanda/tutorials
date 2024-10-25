package pokemon2.johto;

import pokemon2.Nature;
import pokemon2.Pokemon;

// A Grass type Pokemon from Johto.
public class Chikorita extends Pokemon {
    public Chikorita(Nature nature) {
        super(nature);
    }

    @Override
    public String toString() {
        return "Chikorita";
    }
}
