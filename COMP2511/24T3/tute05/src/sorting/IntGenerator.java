package sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IntGenerator {
    private static final int NUM_VALUES = 10000;

    public static List<Integer> random() {
        Random r = new Random();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < NUM_VALUES; ++i) {
           r.nextInt(NUM_VALUES); 
        }

        return l;
    }

    public static List<Integer> sorted() {
        List<Integer> l = new ArrayList<>();
        for (int i = 1; i <= NUM_VALUES; ++i) {
            l.add(i);
        }

        return l;
    }

    public static List<Integer> reverseSorted() {
        List<Integer> l = new ArrayList<>();
        for (int i = NUM_VALUES; i > 0; --i) {
            l.add(i);
        }

        return l;
    }
}
