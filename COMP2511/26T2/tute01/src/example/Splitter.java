package example;

import java.util.Scanner;

public class Splitter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User will input something like "1 2 3 4 5"
        System.out.print("Please input numbers: ");
        String s = sc.nextLine();

        // Splitting makes a 'cut' everywhere it sees a character/string
        // "1 2 3 4 5".split(" ") = ["1", "2", "3", "4", "5"]
        String[] nums = s.split(" ");

        // Note the structure of the for-loop; we don't need to use indexing.
        int sum = 0;
        for (String num : nums) {
            sum += Integer.parseInt(num);
        }

        // The Scanner object is basically the only time you have to "free" memory.
        sc.close();
        System.out.println(sum);
    }
}
