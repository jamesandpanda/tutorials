package list;

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {
    private MyLinkedList<T> l;

    public MyIterator(MyLinkedList<T> l) {
        this.l = l;
    }

    @Override
    public boolean hasNext() {
        // Every non-null node has a next node (for the last node, null being the
        // next node still counts)
        return !(l == null);
    }

    @Override
    public T next() {
        // Let's say I'm iterating over 1 2 3
        // The first usage of the iterator should return 1 and move the iterator to 2
        // The second usage of the iterator should return 2 and move the iterator to 3
        // The third usage of the iterator should return 3 and move the iterator to null
        // next() is only safe to call if hasNext() returns true
        T value = l.value;
        l = l.next;

        return value;
    }
}
