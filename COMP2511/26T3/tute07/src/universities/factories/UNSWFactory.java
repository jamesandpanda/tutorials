package universities.factories;

import java.util.Random;

import universities.Lecturer;
import universities.Student;
import universities.unsw.*;

public class UNSWFactory implements UniFactory {
    private static int nextId = 5000000;

    @Override
    public Student createStudent() {
        return new UNSWStudent(nextId++, new Random().nextInt(1, 11));
    }

    @Override
    public Lecturer createLecturer() {
        return new UNSWLecturer(nextId++, 20);
    }
}
