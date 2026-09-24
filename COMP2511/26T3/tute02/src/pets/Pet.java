package pets;

import java.util.List;

public abstract class Pet {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // abstract method - don't have to provide an implementation in this class
    // the concrete subclasses will implement this
    public abstract void makeNoise();

    public static void main(String[] args) {
        List<Pet> pets = List.of(new Bird("Blue"), new Cat("Cookie"), new Dog("Duke"));

        // way better than the original code which used instanceof to type-check
        // and then print the appropriate string depending on it!
        // this is polymorphism at play :)
        for (Pet p : pets) {
            p.makeNoise();
        }
    }
}
