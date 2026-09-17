package examples;

import java.util.Scanner;

public class Sum {    
    public static void main(String[] args) {
        // scan in a line like "1 2 3 4 5" and add them together
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input space-separated numbers: "); // no new line
        String line = sc.nextLine(); // this asks for input from the user
        sc.close();

        // "1 2 3 4 5"
        // "split" the string
        // "1 2 3 4 5".split(" ") -> ["1", "2", "3", "4", "5"]
        String[] nums = line.split(" ");

        // C-STYLE LOOP; DON'T DO
        // for (int i = 0; i < nums.length; ++i) {
        //     System.out.println(nums[i]);
        // }

        int sum = 0;
        for (String num : nums) {
            // we can't do sum += num because num is of type String and sum is int
            // what we have to is PARSE a string into an integer
            // parsing example: "5" -> an actual int 5
            // Integer.parseInt()

            sum += Integer.parseInt(num);
        }

        System.out.println(sum);

    }
}
