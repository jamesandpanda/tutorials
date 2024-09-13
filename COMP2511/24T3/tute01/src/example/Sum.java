package example;

import java.util.Scanner;

public class Sum {
    // Our input will look something like: 1 2 3 4 5
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        // s = "The quick brown fox" 
        // s.split(" ") = ["The", "quick", "brown", "fox"]

        String[] lines = line.split(" ");
        // lines = ["1", "2", "3", "4", "5"]

        int sum = 0;
        for (String num : lines) {
            sum += Integer.parseInt(num);
        }

        System.out.println(sum);
        sc.close();
    }
}
