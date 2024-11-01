package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ConcurrentError {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // This results in a ConcurrentModificationException. To see why, refer
        // to the bottom translation using .hasNext() and .next().
        for (Integer num : list) {
            if (num == 1) {
                list.remove(num);
            }

            // But if we remove 1 while iterating

            System.out.println(num);
        }

        // The above code can be translated as the following:
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            Integer num = iter.next();
            // Remember that all an iterator needs to know is what the *next* element
            // will be, similarly to how a linked list is implemented. As long as it
            // knows this, it knows how to iterate over the collection.
            // Initially, the list initially looks like:
            // 1 -> 2 -> 3 -> END (null)
            // But if 1 is removed, how does it know what the next node is afterwards?
            // It doesn't, which results in an exception.
            if (num == 1) {
                list.remove(num);
            }

            System.out.println(num);
        }
    }
}
