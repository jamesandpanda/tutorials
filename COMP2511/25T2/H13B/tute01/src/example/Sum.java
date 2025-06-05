package example;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // We will receive an input of the form "a b c d e" from the user.
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        sc.close();

        // line = "1 4 5 2"
        // .split(" ") = ["1", "4", "5", "2"]
        String[] nums = line.split(" ");
        int sum = 0;
        for (String num : nums) {
            sum += Integer.parseInt(num);
            // parseInt turns: "5" -> 5
        }

        System.out.println(sum);
    }
}
