package stream;

import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> strings = List.of("1", "2", "3", "4", "5");
        // strings.stream().forEach(string -> System.out.println(string));

        List<String> strings2 = List.of("1", "2", "3", "4", "5");
        int result = strings2.stream().mapToInt(s -> Integer.parseInt(s)).sum();
        System.out.println(result);

        List<Integer> nums = strings2.stream().map(s -> Integer.parseInt(s)).toList();
        nums.stream().forEach(num -> System.out.println(num));

        // "immutable list" vs. "mutable list"
        List<Integer> nums2 = new ArrayList<Integer>(nums);
        nums2.add(6);

        // another way to get a mutable list
        List<Integer> nums3 = strings2.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
        nums3.add(6);
    }
}
