package stream;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Task 1: Print out these words using forEach()
        List<String> words = List.of("hello", "comp2511", "streams");

        // these are equivalent
        // for (String s : words) {
        //     System.out.println(s);
        // }

        // words.forEach(w -> System.out.println(w));

        // Task 2: Re-write the parsing logic using streams
        List<String> numStrings = List.of("1", "2", "2", "3", "3", "4", "5");

        // these are equivalent
        // List<Integer> nums = new ArrayList<Integer>();
        // for (String num : numStrings) {
        //     nums.add(Integer.parseInt(num));
        // }
        List<Integer> nums2 = numStrings.stream().map(s -> Integer.parseInt(s)).toList();
        List<Integer> nums3 = numStrings.stream().map(Integer::parseInt).toList();
        // the Integer::parseInt does the same thing, this is called a "method reference"

        // Task 3: Find the sum and product of the above numbers using streams

        // if you use .sum(), you need to know that the stream contains numerical types
        int sum = nums2.stream().mapToInt(x -> x).sum();
        int sum2 = nums2.stream().reduce(0, (a, b) -> a + b);
        int product = nums2.stream().reduce(1, (a, b) -> a * b);
        System.out.println(sum2);
        System.out.println(product);

        // Task 4: Print out the list of nums without any duplicates using streams
        List<Integer> noDuplicates = nums2.stream().distinct().toList();
        System.out.println(noDuplicates);
    }
}
