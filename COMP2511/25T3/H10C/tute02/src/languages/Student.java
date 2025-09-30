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

    public abstract void sayHi();

    public static void main(String[] args) {
        Student a = new ChineseStudent("Alice");
        Student b = new EnglishStudent("Bob");
        Student c = new FrenchStudent("Charlotte");
        Student d = new SpanishStudent("David");

        List<Student> students = List.of(a, b, c, d);

        for (Student s : students) {
            s.sayHi();
        }
    }
}
