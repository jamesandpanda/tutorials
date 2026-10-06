package preconditions;

import java.util.Scanner;

public class App {
    // Asks user to input a word until EOF.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberParser parser = new NumberParser();

        System.out.print("Input a number in words: ");
        while (sc.hasNextLine()) {
            String word = sc.nextLine();
            System.out.println("Parsed " + parser.parse(word));
            System.out.print("Input a number in words: ");
        }

        sc.close();
    }
}
