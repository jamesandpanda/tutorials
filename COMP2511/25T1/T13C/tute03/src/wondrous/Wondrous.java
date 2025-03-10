package wondrous;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Wondrous {
    public List<Integer> wondrous(int start) {
        if (start < 1) {
            throw new IllegalArgumentException("start must be >= 1");
        } else if (start == 1) {
            return new ArrayList<>();
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

    // An example of a method that throws a checked exception.
    // Note that the checked exception needs to be explicitly declared
    // in the method signature.
    public void lol() throws IOException {
        FileWriter a = new FileWriter("abc.txt");
    }
}
