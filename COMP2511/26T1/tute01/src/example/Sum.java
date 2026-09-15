package example;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // this is how we receive a line of input from the user
        String s = sc.nextLine();

        // !!! make sure to close the scanner as soon as you're done
        // receiving input from the user !!!
        // this is basically the only time you will have to explicitly free memory
        sc.close();

        // we are scanning a string like "1 2 3 4 5"
        // "splitting" a string
        // .split(" ") makes a 'cut' everywhere it sees a space
        // "1 2 3 4 5" -> ["1", "2", "3", "4", "5"]
        String[] nums = s.split(" ");

        // after splitting a string, we get an array of strings back
        // so we can't directly add them together; "1" + "2" = "12", not 3
        // so we have to turn them into integers first
        // Integer.parseInt("5"); // "5" -> integer 5

        int sum = 0;
        for (String num : nums) {
            sum += Integer.parseInt(num);
        }

        System.out.println(sum);
    }
}
