package pokemon;

// A Fire type Pokemon.
public class Charmander extends Pokemon {
    public Charmander(Nature nature) {
        super(nature);
    }

    @Override
    public String toString() {
        return "Charmander";
    }
}