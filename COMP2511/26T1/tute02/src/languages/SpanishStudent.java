package languages;

public class SpanishStudent extends Student {
    public SpanishStudent(String name) {
        super(name);
    }

    @Override
    public void sayHi() {
        System.out.println(getName() + " says: ¡Hola!");
    }
}
