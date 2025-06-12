package languages.solution;

import java.util.List;

/* Abstract class now! In this model, a 'student' on its own doesn't really make sense
 * students need to be a student of *something*...
 */
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
            // We've prescribed all concrete students to provide their own implementation
            // of sayHi() - this method here is the "common interface" across all Students.
            // No need to typecheck! Leave the 'responsibility' to the actual objects being called.
            s.sayHi();
        }
    }
}
