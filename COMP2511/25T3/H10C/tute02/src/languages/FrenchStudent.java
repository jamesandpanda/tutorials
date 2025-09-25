package languages;

public class FrenchStudent extends Student {
    public FrenchStudent(String name) {
        super(name);
    }

    @Override
    public void sayHi() {
        System.out.println(getName() + " says: Bonjour!");
    }
}
