package wondrous;

import java.util.ArrayList;
import java.util.List;

public class Wondrous {
    private final int MY_MAGIC_NUMBER = 42;

    public List<Integer> wondrous(int start) throws WondrousException {
        if (start <= 0) {
            throw new WondrousException("start has to be >= 1");
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
            // lines of code you want to run that could potentially throw
            // a checked exception
            w.wondrous(-1);
        } catch (Exception e) {
            // these are the lines of code that will be run if an exception
            // gets thrown in the try block
            System.err.println(e.getMessage());
        }
    }
}
