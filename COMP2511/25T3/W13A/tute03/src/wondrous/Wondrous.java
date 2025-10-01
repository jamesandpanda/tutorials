package wondrous;

import java.util.ArrayList;
import java.util.List;

public class Wondrous {
    private final int MY_MAGIC_NUMBER = 42;

    public List<Integer> wondrous(int start) throws WondrousException {
        // "throw" an exception
        if (start <= 0) {
            throw new WondrousException("start must be >= 1");
        } else if (start == 1) {
            return new ArrayList<Integer>();
        }

        int current = start;
        List<Integer> sequence = new ArrayList<Integer>();

        while (current != 1) {
            sequence.add(current);
            if (current % 2 == 0) {
                current /= 2;
            } else {
                current = (current * 3) + 1;
            }
        }

        sequence.add(1);
        return sequence;
    }

    public static void main(String[] args) {
        Wondrous w = new Wondrous();

        try {
            System.out.println(w.wondrous(1));
            System.out.println("hello world");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        System.out.println("hello I am still running!");
    }
}
