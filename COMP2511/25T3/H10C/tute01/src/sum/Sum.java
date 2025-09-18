package sum;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        // "1 2 3 4 5"
        // .split(" ")
        // -> ["1", "2", "3", "4", "5"]
        String[] nums = s.split(" ");

        int sum = 0;

        // C-style for loop
        // You may need to use this if you need to use array indexes
        // outside of just accessing specific elements in the array.
        // for (int i = 0; i < nums.length; i++) {
        //     sum += Integer.parseInt(nums[i]);
        // }

        // "Enhanced for loop"/"for-each" loop
        // Preferred when the C-style for loop does the exact same thing!
        // This just loops over all elements in the array.
        for (String num : nums) {
            sum += Integer.parseInt(num);
        }

        System.out.println(sum);
    }
}
