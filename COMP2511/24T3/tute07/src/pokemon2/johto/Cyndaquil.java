package pokemon2.johto;

import pokemon2.Nature;
import pokemon2.Pokemon;

// A Fire type Pokemon from Johto.
public class Cyndaquil extends Pokemon {
    public Cyndaquil(Nature nature) {
        super(nature);
    }

    @Override
    public String toString() {
        return "Cyndaquil";
    }
}
