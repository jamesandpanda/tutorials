package myunsw;

import java.util.Scanner;

public class MyUNSW {
    public static void main(String[] args) {
        System.out.println("Choose a program to enrol a new student into.");
        System.out.println("Options: 'computer science', 'engineering', 'commerce', 'medicine'");

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String program = sc.nextLine().toLowerCase();

            if (!StudentFactory.PROGRAMS.containsKey(program)) {
                System.out.println("Invalid program given.");
            } else {
                Student s = StudentFactory.createStudent(program);
                System.out.println("Enrolled new student with id " + s.getId() + " in program " +
                    s.getProgram() + " with " + s.getLuck() + " luck.");
            }
        }

        sc.close();
    }
}
