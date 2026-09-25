package pets;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("I am cat " + getName());
    }
}
