package pokemon2.kanto;

import pokemon2.Nature;
import pokemon2.Pokemon;

// A Water type Pokemon from Kanto.
public class Squirtle extends Pokemon {
    public Squirtle(Nature nature) {
        super(nature);
    }

    @Override
    public String toString() {
        return "Squirtle";
    }
}