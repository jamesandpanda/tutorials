package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> strings = List.of("1", "2", "3", "4", "5");

        // these do the same thing:
        // vvvv
        for (String string : strings) {
            System.out.println(string);
        }

        // vvvv
        strings.forEach(s -> System.out.println(s));

        // turn the string representation of each number into the actual int
        List<String> strings2 = List.of("1", "2", "3", "4", "5");
        List<Integer> ints = new ArrayList<Integer>();
        for (String string : strings2) {
            ints.add(Integer.parseInt(string));
        }

        List<Integer> nums2 = strings2.stream().map(s -> Integer.parseInt(s)).toList();

        // one way to make a mutable list using a stream
        List<Integer> nums3 = new ArrayList<Integer>(nums2);
        nums3.add(5);

        List<Integer> nums4 = strings2.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
        nums4.add(6);

        List<Integer> a = List.of(1, 2, 3, 4, 5, 6);
        List<String> b = a.stream().map(x -> x.toString()).toList();

        int sum = strings2.stream().mapToInt(s -> Integer.parseInt(s)).sum();
        System.out.println(sum);
    }
}
