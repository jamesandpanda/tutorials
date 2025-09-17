package sum;

// We will receive input from the user via. a class called Scanner
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();

        // 1 2 3 4 5
        // 1 2 3 4 5 -> [1, 2, 3, 4, 5]
        // .split(" ")
        // "1 2 3 4 5" -> .split(" ") -> ["1", "2", "3", "4", "5"]
        String[] numbers = input.split(" ");
        int sum = 0;

        // C-style for loop
        // for (int i = 0; i < numbers.length; ++i) {
        //     sum += Integer.parseInt(numbers[i]);
        // }

        // "for-each"/"for-of" loop
        for (String s : numbers) {
            sum += Integer.parseInt(s);
        }

        System.out.println(sum);
        sc.close();
    }
}
