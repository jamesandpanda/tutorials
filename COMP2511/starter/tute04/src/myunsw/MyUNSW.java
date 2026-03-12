package myunsw;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class MyUNSW {
    public static final Map<String, Integer> PROGRAMS = Map.of(
        "computer science", 3778,
        "engineering", 3707,
        "commerce", 3502,
        "medicine", 3805
    );

    private static List<Student> students = new ArrayList<>();
    private static int nextStudentId = 5000000;

    public static void main(String[] args) {
        System.out.println("Choose a program to enrol a new student into.");
        System.out.println("Options: 'computer science', 'engineering', 'commerce', 'medicine'");

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String program = sc.nextLine().toLowerCase();

            if (!PROGRAMS.containsKey(program)) {
                System.out.println("Invalid program given.");
            } else {
                int id = nextStudentId;
                ++nextStudentId;
                int programCode = PROGRAMS.get(program);
                int luck = new Random().nextInt(1, 11);

                students.add(new Student(id, programCode, luck));
                System.out.println("Enrolled new student with id " + id + " in program " + programCode + " with " + luck + " luck.");
            }
        }

        sc.close();
    }
}
