package wondrous;

import java.util.ArrayList;
import java.util.List;

public class Wondrous {
    public List<Integer> wondrous(int start) throws WondrousException {
        if (start <= 0) {
            throw new WondrousException("start must be positive");
        } else if (start == 1) {
            return new ArrayList<Integer>();
        }

        // - on the debugging interface, use Step Into to move into
        // the lines of code in the temp() method.
        // - if you use Step Over, you will not see what happens in
        // this method.
        temp();

        int current = start;
        List<Integer> sequence = new ArrayList<Integer>();
        sequence.add(start);

        while (current != 1) {
            if (current % 2 == 0) {
                current /= 2;
            } else {
                current = (current * 3) + 1;
            }

            sequence.add(current);
        }

        return sequence;
    }

    public void temp() {
        System.out.println("a");
        System.out.println("b");
        System.out.println("c");
        System.out.println("d");
        System.out.println("e");
    }

    public static void main(String[] args) {
        Wondrous w = new Wondrous();

        try {
            w.wondrous(0);
            System.out.println("no issues");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        // even if an exception gets thrown, if it is handled through
        // a try-catch block, the code will continue running.
        System.out.println("continued running");
    }
}
