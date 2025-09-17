package sum;

// We will receive input from the user via. a class called Scanner
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // We will receive input of the form "1 2 3 4 5"
        // "1 2 3 4 5" -> .split(" ") -> ["1", "2", "3", "4", "5"]
        String[] numbers = input.split(" ");
        int sum = 0;

        // C-style for loop
        // for (int i = 0; i < numbers.length; ++i) {
        //     sum += Integer.parseInt(numbers[i]);
        // }

        // "for-each"/"for-of" loop - PREFERRED!
        for (String s : numbers) {
            // We need to convert the string into its integer representation
            // Since "1" is not the same as 1
            sum += Integer.parseInt(s);
        }

        System.out.println(sum);

        // This is basically the only time we have to do explicit memory management :P
        sc.close();
    }
}
