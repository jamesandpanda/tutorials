package universities.factories;

import java.util.Random;

import universities.Lecturer;
import universities.Student;
import universities.usyd.*;

public class USYDFactory implements UniFactory {
    private static int nextId = 100000000;

    @Override
    public Student createStudent() {
        return new USYDStudent(nextId++, new Random().nextInt(1, 21));
    }

    @Override
    public Lecturer createLecturer() {
        return new USYDLecturer(nextId++, 15);
    }
}
