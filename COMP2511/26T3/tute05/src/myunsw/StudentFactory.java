package myunsw;

import java.util.Map;

public class StudentFactory {
    public static final Map<String, Integer> PROGRAMS = Map.of(
        "computer science", 3778,
        "engineering", 3707,
        "commerce", 3502,
        "medicine", 3805
    );

    private static int nextStudentId = 5000000;

    public static Student createStudent(String program) {
        int id = nextStudentId;
        ++nextStudentId;
        int programCode = PROGRAMS.get(program);

        return new Student(id, programCode);
    }
}
