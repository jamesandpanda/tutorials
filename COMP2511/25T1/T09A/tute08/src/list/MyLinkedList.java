package list;

public class MyLinkedList<T> {
    // primitive values: int, char, double
    // Integer, Double
    // ArrayList<Integer>
    // MyLinkedList<Integer>
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
        MyLinkedList<Integer> ll = new MyLinkedList<Integer>(4);
        ll.add(3);
        ll.add(1);
        ll.add(6);
        ll.add(2);

        ll.print();
        System.out.println("The size of the list is " + ll.size());

        MyLinkedList<String> ll2 = new MyLinkedList<>("hello");
        ll2.add("world");
        ll2.print();
    }
}
