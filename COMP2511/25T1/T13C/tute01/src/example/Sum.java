package example;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        // line will look like 1 2 3 4 5
        String[] lines = line.split(" ");
        int sum = 0;
        for (String l : lines) {
            sum += Integer.parseInt(l);
        }

        sc.close();
        System.out.println(sum);
    }
}
