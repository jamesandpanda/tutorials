package sum;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        // 1 2 3 4 5
        // [1, 2, 3, 4, 5]
        // .split(" ")
        String[] nums = s.split(" ");

        int sum = 0;

        // C-style for loop
        for (int i = 0; i < nums.length; i++) {
            sum += Integer.parseInt(nums[i]);
        }

        for (String num : nums) {
            sum += Integer.parseInt(num);
        }

        System.out.println(sum);
    }
}
