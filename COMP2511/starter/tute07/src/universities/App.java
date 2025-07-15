package universities;

import java.util.Random;
import java.util.Scanner;

import universities.unsw.*;
import universities.usyd.*;

public class App {
    private static int nextUnswId = 5000000;
    private static int nextUsydId = 100000000;
    private static String university = "unsw";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s;
        Lecturer l;

        System.out.println("Options: 'unsw', 'usyd', 'student', 'lecturer'");
        while (sc.hasNextLine()) {
            String input = sc.nextLine().toString();

            if (input.equals("unsw")) {
                university = "unsw";
                System.out.println("> Changed university to UNSW");
            } else if (input.equals("usyd")) {
                university = "usyd";
                System.out.println("> Changed university to USYD");
            } else if (input.equals("student")) {
                switch (university) {
                    case "unsw":
                        s = new UNSWStudent(nextUnswId++, new Random().nextInt(1, 11));
                        System.out.println("> Enrolled " + s);
                        break;
                    case "usyd":
                        s = new USYDStudent(nextUsydId++, new Random().nextInt(1, 11));
                        System.out.println("> Enrolled " + s);
                        break;
                    default:
                        throw new IllegalArgumentException("invalid university");
                }
            } else if (input.equals("lecturer")) {
                switch (university) {
                    case "unsw":
                        l = new UNSWLecturer(nextUnswId++, 20);
                        System.out.println("> Enrolled " + l);
                        break;
                    case "usyd":
                        l = new USYDLecturer(nextUsydId++, 15);
                        System.out.println("> Enrolled " + l);
                        break;
                    default:
                        throw new IllegalArgumentException("invalid university");
                }
            } else {
                System.out.println("> Unrecognised input");
            }
        }

        sc.close();
    }
}
