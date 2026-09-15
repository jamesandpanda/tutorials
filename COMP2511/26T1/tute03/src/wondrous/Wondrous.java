package wondrous;

import java.util.ArrayList;
import java.util.List;

public class Wondrous {
    // WondrousException is the exception that we defined ourselves
    // it is a checked exception, so "throws WondrousException" must be included in the
    // method signature
    public List<Integer> wondrous(int start) throws WondrousException {
        if (start <= 0) {
            throw new WondrousException("start number must be >= 1");
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

        // we need to wrap any code that throws an exception in a "try" block
        // if an exception gets thrown, execution moves to the "catch" block
        // the program can still continue even if an exception gets thrown as long
        // as it is caught
        try {
            w.wondrous(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program is still running");
    }
}
