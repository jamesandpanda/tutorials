package languages;

import java.util.List;

public abstract class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // we define an abstract method that each of the concrete students will
    // implement on their own, according to what language they are learning
    public abstract void sayHi();

    public static void main(String[] args) {
        Student a = new ChineseStudent("Alice");
        Student b = new EnglishStudent("Bob");
        Student c = new FrenchStudent("Charlotte");
        Student d = new SpanishStudent("David");

        List<Student> students = List.of(a, b, c, d);

        // old ugly code!! :nauseated_face:
        // for (Student s : students) {
        //     if (s instanceof ChineseStudent) {
        //         System.out.println(s.getName() + " says: 你好!");
        //     } else if (s instanceof EnglishStudent) {
        //         System.out.println(s.getName() + " says: Hello!");
        //     } else if (s instanceof FrenchStudent) {
        //         System.out.println(s.getName() + " says: Bonjour!");
        //     } else if (s instanceof SpanishStudent) {
        //         System.out.println(s.getName() + " says: ¡Hola!");
        //     }
        //     // and so on and so forth...
        // }

        // new clean code!! :heart_eyes:
        for (Student s : students) {
            s.sayHi();
        }
    }
}
