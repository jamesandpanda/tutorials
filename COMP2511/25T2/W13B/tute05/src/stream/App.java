package stream;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // List<String> strings = List.of("1", "2", "3", "4", "5");
        // strings.stream().forEach(s -> System.out.println(s));

        List<String> strings2 = List.of("1", "2", "3", "4", "5");
        // I want to map each string s to Integer.parseInt(s)
        List<Integer> ints = strings2.stream().map(s -> Integer.parseInt(s)).toList();

        // method reference - alternative syntax that does the same thing
        // List<Integer> ints2 = strings2.stream().map(Integer::parseInt).toList();

        System.out.println(ints);
    }
}
