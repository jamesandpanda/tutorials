package stream;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Task 1: Print out these words using forEach()
        List<String> words = List.of("hello", "comp2511", "streams");

        // Task 2: Re-write the parsing logic using streams
        List<String> numStrings = List.of("1", "2", "2", "3", "3", "4", "5");
        List<Integer> nums = new ArrayList<Integer>();
        for (String num : numStrings) {
            nums.add(Integer.parseInt(num));
        }

        // Task 3: Find the sum and product of the above numbers using streams

        // Task 4: Print out the list of nums without any duplicates using streams
    }
}
