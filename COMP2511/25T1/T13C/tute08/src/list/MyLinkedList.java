package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// ArrayList<Integer>
// MyLinkedList<Integer> = new MyLinkedList<Integer>(1);
// MyLinkedList<Integer> = new MyLinkedList<String>(1); WONT WORK
// MyLinkedList<String>
// ArrayList l
public class MyLinkedList<T> implements Iterable<T> {
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

    public static void main(String[] args) {
        MyLinkedList<Integer> ll = new MyLinkedList<>(4);
        ll.add(3);
        ll.add(1);
        ll.add(6);
        ll.add(2);

        MyLinkedList<String> ll2 = new MyLinkedList<>("hello");
        ll2.add("world");

        ll.print();
        System.out.println("The size of the list is " + ll.size());

        ll2.print();

        // List<Integer> l = new ArrayList<>();
        // for (Integer num : l) {
        //      // logic here
        // }

        // The above and below code are actually functionally identical.

        // Iterator<Integer> iter = l.iterator();
        // while (iter.hasNext()) {
        //      // logic here
        // }

        // Since the linked list is Iterable and we have provided our own iterator
        // to the collection, we can use the 'for of' syntax.
        for (Integer num : ll) {
            System.out.println(num);
        }

    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<T>(this);
    }
}
