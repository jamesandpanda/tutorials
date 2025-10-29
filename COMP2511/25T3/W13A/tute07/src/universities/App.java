package universities;

import java.util.Scanner;

import universities.factories.*;

public class App {
    private static UniFactory factory = new UNSWFactory();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Options: 'unsw', 'usyd', 'student', 'lecturer'");
        while (sc.hasNextLine()) {
            String input = sc.nextLine().toString();

            if (input.equals("unsw")) {
                factory = new UNSWFactory();
                System.out.println("> Changed university to UNSW");
            } else if (input.equals("usyd")) {
                factory = new USYDFactory();
                System.out.println("> Changed university to USYD");
            } else if (input.equals("student")) {
                Student s = factory.createStudent();
                System.out.println("> Registered " + s);
            } else if (input.equals("lecturer")) {
                Lecturer l = factory.createLecturer();
                System.out.println("> Registered " + l);
            } else {
                System.out.println("> Unrecognised input");
            }
        }

        sc.close();
    }
}
