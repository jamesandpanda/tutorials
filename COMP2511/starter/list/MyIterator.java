package list;

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {
    private MyLinkedList<T> curr;

    public MyIterator(MyLinkedList<T> list) {
        curr = list;
    }

    @Override
    public boolean hasNext() {
        return curr != null;
    }

    @Override
    public T next() {
        T value = curr.getValue();
        curr = curr.getNext();

        return value;
    }
}
