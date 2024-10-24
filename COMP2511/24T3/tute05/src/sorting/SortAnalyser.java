package sorting;

import java.util.List;
import java.util.Scanner;

public class SortAnalyser {
    public static void main(String[] args) {
        SortAnalyser s = new SortAnalyser();
        s.run();
    }

    public void run() {
        System.out.println("Welcome to SortAnalyser! Type '?' for help.");

        Scanner sc = new Scanner(System.in);
        List<Integer> data = IntGenerator.random();

        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            switch (s) {
                case "bubblesort":
                    break;
                case "mergesort":
                    break;
                case "quicksort":
                    break;
                case "random":
                    data = IntGenerator.random(); break;
                case "sorted":
                    data = IntGenerator.sorted(); break;
                case "reverse":
                    data = IntGenerator.reverseSorted(); break;
                case "quit":
                    sc.close(); return;
                default:
                    System.out.println("Invalid command!");
            }
        }

        sc.close();
    }
}
