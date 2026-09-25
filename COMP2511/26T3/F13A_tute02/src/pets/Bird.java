package pets;

public class Bird extends Pet {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("I am bird " + getName());
    }
}
