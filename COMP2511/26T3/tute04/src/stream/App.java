package stream;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> words = List.of("hello", "comp2511", "streams");

        // Task 1: Print out the words using forEach()
        words.forEach(s -> System.out.println(s));
        words.stream().forEach(s -> System.out.println(s));

        // Task 2: Re-write the parsing logic using streams
        List<String> numStrings = List.of("1", "2", "2", "3", "3", "4", "5");
        // List<Integer> nums = new ArrayList<Integer>();
        // for (String num : numStrings) {
        //     nums.add(Integer.parseInt(num));
        // }

        // map applies a function to all elements in the stream
        // the name of the function here is a "lambda function" which is the same as
        // "anonymous functions" from COMP1531.
        List<Integer> nums = numStrings.stream().map(s -> Integer.parseInt(s)).toList();
        // another syntax for the same thing, using a "method-reference"
        List<Integer> nums2 = numStrings.stream().map(Integer::parseInt).toList();

        // Task 3: Find the sum and product of the above numbers using streams
        // reduce syntax - start off with the beginning element (0 for addition, 1 for multiplication)
        // then provide the lambda function for what to do, addition is (a, b) -> a + b
        // multiplication is (a, b) -> a * b
        int sum = nums.stream().reduce(0, (a, b) -> a + b);
        int product = nums.stream().reduce(1, (a, b) -> a * b);

        // Task 4: Print out the list of nums without any duplicates using streams
        // .distinct() removes all duplicate elements
        List<Integer> noDuplicates = nums.stream().distinct().toList();
        System.out.println(noDuplicates);
    }
}
