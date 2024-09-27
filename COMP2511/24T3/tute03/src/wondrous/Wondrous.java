package wondrous;

import java.util.ArrayList;
import java.util.List;

public class Wondrous {
    public List<Integer> wondrous(int start) {
        if (start < 1) {
            throw new IllegalArgumentException("start has to be positive");
        }

        int current = start;
        List<Integer> sequence = new ArrayList<Integer>();

        if (start == 1) {
            return sequence;
        }

        while (current != 1) {
            sequence.add(current);
            if (current % 2 == 1) {
                current = (current * 3) + 1;
            } else {
                current = current / 2;
            }
        }
        sequence.add(1);

        return sequence;
    }

}