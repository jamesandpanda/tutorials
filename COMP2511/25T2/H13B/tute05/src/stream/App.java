package stream;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // List<String> strings = List.of("1", "2", "3", "4", "5");
        // strings.stream().forEach(s -> System.out.println(s));

        List<String> strings2 = List.of("1", "2", "3", "4", "5");
        // List<Integer> ints = new ArrayList<Integer>();
        // for (String string : strings2) {
        //     ints.add(Integer.parseInt(string));
        // }

        List<Integer> ints2 = strings2.stream().map(s -> Integer.parseInt(s)).toList();
        List<Integer> ints3 = new ArrayList<>(ints2);
        ints3.add(6);
        System.out.println(ints3);
    }
}
