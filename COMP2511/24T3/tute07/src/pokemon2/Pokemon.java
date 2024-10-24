package pokemon2;

public abstract class Pokemon {
    private Nature nature;

    public Pokemon(Nature nature) {
        this.nature = nature;
    }

    public Nature getNature() {
        return nature;
    }
}
