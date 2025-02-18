package example;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input is going to look something like "1 2 3 4 5"
        String line = scanner.nextLine();
        // This is basically the only time you'll actually have to do something
        // similar to freeing memory - scanners require you to explicitly do this.
        scanner.close();

        // Splitting is how we will separate "1 2 3 4 5" into individual strings that
        // we can actually parse and use. Splitting by " " will essentially make
        // a 'cut' everywhere a space is found, forming individual elements and
        // moving them into an array.
        String[] nums = line.split(" ");
        // nums will contain ["1", "2", "3", "4", "5"]

        int sum = 0;
        for (String num : nums) {
            // For example, Integer.parseInt("5") gives you the actual integer 5.
            sum += Integer.parseInt(num);
        }

        System.out.println(sum);
    }
}
