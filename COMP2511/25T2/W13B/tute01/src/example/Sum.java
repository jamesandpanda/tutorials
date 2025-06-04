package example;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // We will receive an input of the form "1 2 3 4 5"
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        // "1 2 3 4 5"
        // .split(" "): "1 2 3 4 5" -> ["1", "2", "3", "4", "5"]
        String[] nums = s.split(" ");

        int sum = 0;
        for (String num : nums) {
            // Need to convert the strings into integers so we can add them.
            sum += Integer.parseInt(num);
        }

        System.out.println(sum);
    }
}
