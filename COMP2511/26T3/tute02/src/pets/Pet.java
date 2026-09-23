package pets;

import java.util.List;

public class Pet {
    // TODO: Improve the quality of the code
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        List<Pet> pets = List.of(new Bird("Blue"), new Cat("Cookie"), new Dog("Duke"));

        for (Pet p : pets) {
            if (p instanceof Bird) {
                System.out.println("I am bird " + p.getName());
            } else if (p instanceof Cat) {
                System.out.println("I am cat " + p.getName());
            } else if (p instanceof Dog) {
                System.out.println("I am dog " + p.getName());
            }
        }
    }
}
