package stream;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> strings = List.of("hello", "world", "COMP", "2511", "OOP");

        // One-liner lambda expression
        strings.forEach(s -> System.out.println(s));

        // Multi-line lambda expression
        strings.forEach(s -> {
            int a = 5; // just a random expression to show more than one line
            System.out.println(s);
        });

        List<String> strings2 = List.of("1", "2", "3", "4", "5");

        // .toList() will return an immutable list
        List<Integer> ints = strings2.stream().map(s -> Integer.parseInt(s)).toList();

        // Another way to the same thing as above
        // This calls the parseInt method, belonging to the Integer class, on every element
        List<Integer> ints2 = strings2.stream().map(Integer::parseInt).toList();

        // If you want an ArrayList, you can construct another one using the immutable list like so.
        // This one will be mutable
        ArrayList<Integer> ints3 = new ArrayList<>(ints);
        System.out.println(ints3);
    }
}
