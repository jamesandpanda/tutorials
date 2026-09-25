package pets;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("I am dog " + getName());
    }
}
