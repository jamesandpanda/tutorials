package list;

// Comparable<T>

public class MySortedLinkedList<T extends Comparable<T>> extends MyLinkedList<T> {
    public MySortedLinkedList(T value) {
        super(value);
    }

    @Override
    public void add(T value) {
        // a.compareTo(b)
        // negative if a is 'less than b'
        // zero if a == b
        // positive if a is 'greater than b'
        MyLinkedList<T> curr = this;

        // this is the same as value < curr.value
        if (value.compareTo(curr.value) < 0) {
            // Insertion at head
            T oldValue = curr.value;
            MyLinkedList<T> newTail = new MySortedLinkedList<T>(oldValue);
            newTail.next = curr.next;
            curr.value = value;
            curr.next = newTail;
            return;
        }

        MyLinkedList<T> newNode = new MySortedLinkedList<T>(value);
        while (curr != null && curr.next != null && value.compareTo(curr.next.value) > 0) {
            curr = curr.next;
        }

        if (curr.next != null) {
            // Insertion somewhere in the middle
            newNode.next = curr.next;
            curr.next = newNode;
        } else {
            // Insertion at tail
            curr.next = newNode;
        }
    }

    public static void main(String[] args) {
        MyLinkedList<Integer> ll = new MySortedLinkedList<>(4);
        ll.add(3);
        ll.add(1);
        ll.add(6);
        ll.add(2);

        ll.print();
        System.out.println("The size of the list is " + ll.size());

        MyLinkedList<String> ll2 = new MySortedLinkedList<>("world");
        ll2.add("hello");
        ll2.print();
    }
}
