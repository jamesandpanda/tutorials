package list;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T> {
    // primitive values: int, char, double - these do not work when given as generic
    // type parameters
    // would have to use the object-wrapped versions like Integer, Double

    public T value;
    public MyLinkedList<T> next;

    public MyLinkedList(T value) {
        this.value = value;
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
        System.out.print(this.value);

        MyLinkedList<T> curr = this.next;
        while (curr != null) {
            System.out.print(" " + curr.value);
            curr = curr.next;
        }
        System.out.println();
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<T>(this);
    }

    public static void main(String[] args) {
        MyLinkedList<Integer> ll = new MyLinkedList<Integer>(4);
        ll.add(3);
        ll.add(1);
        ll.add(6);
        ll.add(2);

        ll.print();
        System.out.println("The size of the list is " + ll.size());

        // These two snippets of code are actually functionally identical - the
        // 'for of' uses iterators behind the scenes. 
        // for (Integer num : list) {
        //     // some logic
        // }

        // Iterator<Integer> iter = list.iterator();
        // while (iter.hasNext()) {
        //     Integer num = iter.next();
        //     // some logic
        // }

        Iterator<Integer> iter = ll.iterator();
        while (iter.hasNext()) {
            Integer num = iter.next();
            System.out.println(num);
        }

        // Since the linked list is Iterable and we have provided our own iterator
        // to the collection, we can use the 'for of' syntax.
        for (Integer num : ll) {
            System.out.println(num);
        }
    }
}
