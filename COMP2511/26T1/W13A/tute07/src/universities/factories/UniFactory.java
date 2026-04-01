package universities.factories;

import universities.Lecturer;
import universities.Student;

public interface UniFactory {
    public Student createStudent();

    public Lecturer createLecturer();
}
