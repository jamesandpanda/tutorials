package list;

public class MyLinkedList {
    protected int value;
    protected MyLinkedList next;

    public MyLinkedList(int value) {
        this.value = value;
    }

    public void add(int value) {
        MyLinkedList curr = this;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = new MyLinkedList(value);
    }

    public int size() {
        int size = 0;
        MyLinkedList curr = this;

        while (curr != null) {
            ++size;
            curr = curr.next;
        }

        return size;
    }

    public void print() {
        System.out.print(this.value);

        MyLinkedList curr = this.next;
        while (curr != null) {
            System.out.print(" " + curr.value);
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList(4);
        ll.add(3);
        ll.add(1);
        ll.add(6);
        ll.add(2);

        ll.print();
        System.out.println("The size of the list is " + ll.size());
    }
}
