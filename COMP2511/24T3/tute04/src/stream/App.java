package stream;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> strings = List.of("1", "2", "3", "4", "5");
        strings.forEach(s -> System.out.println(s));
        // If we're executing more than one line:
        // strings.forEach(s -> {
        //     System.out.println(s);
        //     // more logic
        // });

        List<String> strings2 = List.of("1", "2", "3", "4", "5");
        List<Integer> ints = strings2.stream().map(s -> Integer.parseInt(s)).toList();

        // An alternative way to do the same thing, using a *scope operator* (i.e. a
        // method belong to a class, or instances of it), like Integer::parseInt.
        // List<Integer> ints = strings2.stream().map(Integer::parseInt).toList();
        System.out.println(ints);
    }
}