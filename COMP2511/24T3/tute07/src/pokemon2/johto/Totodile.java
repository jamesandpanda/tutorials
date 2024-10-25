package pokemon2.johto;

import pokemon2.Nature;
import pokemon2.Pokemon;

// A Water type Pokemon from Johto.
public class Totodile extends Pokemon {
    public Totodile(Nature nature) {
        super(nature);
    }

    @Override
    public String toString() {
        return "Totodile";
    }
}
