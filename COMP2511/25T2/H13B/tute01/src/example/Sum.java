package example;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // 1 4 5 2
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        sc.close();

        // line = "1 4 5 2"
        // .split(" ") = ["1", "4", "5", "2"]
        String[] lines = line.split(" ");
        int sum = 0;
        for (String num : lines) {
            sum += Integer.parseInt(num);
            // parseInt turns: "5" -> 5
        }

        System.out.println(sum);
    }
}
