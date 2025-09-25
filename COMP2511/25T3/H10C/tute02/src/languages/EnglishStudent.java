package languages;

public class EnglishStudent extends Student {
    public EnglishStudent(String name) {
        super(name);
    }

    @Override
    public void sayHi() {
        System.out.println(getName() + " says: Hello");
    }
}
