package example;

import java.util.Scanner;

public class Splitter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input numbers: ");

        // 1 2 3 4 5
        String s = sc.nextLine();

        // if you split the string by whitespace
        // ["1", "2", "3", "4", "5"]
        String[] nums = s.split(" ");
        int sum = 0;
        for (String num : nums) {
            sum += Integer.parseInt(num);
        }

        sc.close();
        System.out.println(sum);
    }
}
