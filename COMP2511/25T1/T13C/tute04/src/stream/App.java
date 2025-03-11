package stream;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> strings = List.of("hello", "world", "COMP", "2511", "OOP");
        // One-line lambda expression
        strings.forEach(s -> System.out.println(s));

        // Multi-line lambda expression
        strings.forEach(s -> {
            System.out.println("hi");
            System.out.println(s);
        });

        List<String> strings2 = List.of("1", "2", "3", "4", "5");
        List<Integer> ints = strings2.stream().map(s -> Integer.parseInt(s)).toList();

        // 'scope' operator version, where I apply the parseInt method (which is a static
        // method belonging to the Integer class) to every element
        List<Integer> ints2 = strings2.stream().map(Integer::parseInt).toList();
        // The above will return immutable lists. If you want a mutable ArrayList,
        // you can just instantiate a new ArrayList with the list as a parameter.
        ArrayList<Integer> ints3 = new ArrayList<>(ints);
        System.out.println(ints);

        // Another example: let's say I have a sequence of numbers and I want to filter
        // it to only include even numbers, and from the remaining numbers I want to map
        // each element x to 3x + 1.
        List<Integer> ints4 = List.of(5, 2, 67, 3, 1, 7, 34, 16, 26);
        List<Integer> ints5 = ints4.stream().filter(x -> x % 2 == 0).map(x -> 3 * x + 1).toList();
        System.out.println(ints5);
    }
}
