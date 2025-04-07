// package list;

// public class MySortedLinkedList extends MyLinkedList {
//     public MySortedLinkedList(int value) {
//         super(value);
//     }

//     @Override
//     public void add(int value) {
//         MyLinkedList curr = this;

//         if (value < curr.value) {
//             // Insertion at head
//             int oldValue = curr.value;
//             MyLinkedList newTail = new MySortedLinkedList(oldValue);
//             newTail.next = curr.next;
//             curr.value = value;
//             curr.next = newTail;
//             return;
//         }

//         MyLinkedList newNode = new MySortedLinkedList(value);
//         while (curr != null && curr.next != null && value > curr.next.value) {
//             curr = curr.next;
//         }

//         if (curr.next != null) {
//             // Insertion somewhere in the middle
//             newNode.next = curr.next;
//             curr.next = newNode;
//         } else {
//             // Insertion at tail
//             curr.next = newNode;
//         }
//     }

//     public static void main(String[] args) {
//         MyLinkedList ll = new MySortedLinkedList(4);
//         ll.add(3);
//         ll.add(1);
//         ll.add(6);
//         ll.add(2);

//         ll.print();
//         System.out.println("The size of the list is " + ll.size());
//     }
// }
