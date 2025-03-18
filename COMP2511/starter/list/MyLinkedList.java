package list;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T> {
    private T value;
    private MyLinkedList<T> next;

    public MyLinkedList(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public MyLinkedList<T> getNext() {
        return next;
    }

    public void add(T value) {
        MyLinkedList<T> curr = this;
        while (curr.next != null) {
            curr = curr.next;
        }
        
        curr.next = new MyLinkedList<T>(value);
    }

    public int size() {
        int size = 0;
        MyLinkedList<T> curr = this;

        while (curr != null) {
            ++size;
            curr = curr.next;
        }

        return size;
    }

    public void print() {
        MyLinkedList<T> curr = this;
        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<T>(this);
    }

    public static void main(String[] args) {
        MyLinkedList<Integer> ll = new MyLinkedList<>(4);
        ll.add(3);
        ll.add(1);
        ll.add(6);
        ll.add(2);

        ll.print();
        System.out.println(ll.size());

        for (Integer i : ll) {
            System.out.println(i);
        }
    }
}
