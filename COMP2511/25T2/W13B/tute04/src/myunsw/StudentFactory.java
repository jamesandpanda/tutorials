package myunsw;

import java.util.Map;
import java.util.Random;

public class StudentFactory {
    private static int nextStudentId = 5000000;

    public static final Map<String, Integer> PROGRAMS = Map.of(
        "computer science", 3778,
        "engineering", 3707,
        "commerce", 3502,
        "medicine", 3805
    );

    public static Student createStudent(String program) {
        // Move the relatively complicated construction logic here.
        int id = nextStudentId;
        ++nextStudentId;
        int programCode = PROGRAMS.get(program);
        int luck = new Random().nextInt(1, 11);

        return new Student(id, programCode, luck);
    }
    
}
