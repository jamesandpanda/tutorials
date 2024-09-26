package wondrous;

import java.util.ArrayList;
import java.util.List;

public class Wondrous {
    public List<Integer> wondrous(int start) {
        int current = start;
        List<Integer> sequence = new ArrayList<Integer>();

        while (current != 1) {
            sequence.add(current);
            if (current % 2 == 0) {
                current = (current * 3) + 1;
            } else {
                current = current / 2;
            }
        }

        return sequence;
    }

}