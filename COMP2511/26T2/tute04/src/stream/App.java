package stream;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Task 1: Print out these words using forEach()
        List<String> words = List.of("hello", "comp2511", "streams");

        words.forEach(s -> System.out.println(s));

        // Task 2: Re-write the parsing logic using streams
        List<String> numStrings = List.of("1", "2", "2", "3", "3", "4", "5");
        List<Integer> nums = new ArrayList<Integer>();
        for (String num : numStrings) {
            nums.add(Integer.parseInt(num));
        }

        // this does the same thing as the logic above
        nums = numStrings.stream().map(s -> Integer.parseInt(s)).toList();

        // Task 3: Find the sum and product of the above numbers using streams
        int sum = nums.stream().reduce(0, (a, b) -> a + b);
        int product = nums.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Task 3");
        System.out.println(sum);
        System.out.println(product);

        // Task 4: Print out the list of nums without any duplicates using streams
        System.out.println("Task 4");
        nums.stream().distinct().forEach(i -> System.out.println(i));
    }
}
