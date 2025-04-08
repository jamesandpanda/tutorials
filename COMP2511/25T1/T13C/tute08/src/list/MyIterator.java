package list;

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {
    private MyLinkedList<T> l;

    public MyIterator(MyLinkedList<T> l) {
        this.l = l;
    }

    @Override
    public boolean hasNext() {
        return !(l == null);
    }

    @Override
    public T next() {
        T value = l.value;
        l = l.next;

        return value;
    }
}
