package languages;

public class EnglishStudent extends Student {
    public EnglishStudent(String name) {
        super(name);
    }

    public void sayHi() {
        System.out.println(getName() + " says: Hello!");
    }
}
