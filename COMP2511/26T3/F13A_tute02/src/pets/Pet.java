package pets;

import java.util.List;

public abstract class Pet {
    // TODO: Improve the quality of the code
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void sayHello();

    public static void main(String[] args) {
        List<Pet> pets = List.of(new Bird("Blue"), new Cat("Cookie"), new Dog("Duke"));

        for (Pet p : pets) {
            p.sayHello();
        }
    }
}
