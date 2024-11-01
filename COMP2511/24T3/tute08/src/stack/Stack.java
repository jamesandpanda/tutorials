package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * A Simple Stack.
 * @param <E> the type of the elements stored in the stack.
 */
public class Stack<E> implements Iterable<E> {
    private List<E> list = new ArrayList<>();
    
    /**
     * Pushes an element onto the top of the stack.
     * @param element
     */
    public void push(E element) {
        list.add(element);
    }

    /**
     * Returns the top element of the stack, without removing it.
     */
    public E peek() {
        return list.get(list.size() - 1);
    }

    /**
     * Removes the top element of the stack, and returns that element.
     * @precondition The stack is not empty.
     */
    public E pop() {
        E last = peek();
        list.remove(list.size() - 1);

        return last;
    }

    /**
     * Returns an iterator to the internal data structure of the stack.
     */
    public Iterator<E> iterator() {
        ArrayList<E> copy = new ArrayList<E>(list);
        Collections.reverse(copy);

        // The iterator will function on this copy.
        // The copy is reversed because a stack represented as [1, 2, 3, 4]
        // would be expected to be iterated as 4 -> 3 -> 2 -> 1 (first in last out).

        // Note: This iterator wouldn't really work if elements were to be pushed or popped
        // from the stack (it might, but there is no guarantee). This is related to
        // the idea of *iterator invalidation*, where an iterator can no longer
        // be considered valid for use if the container is to be modified. Some
        // containers offer ways around this, like a remove() method returning a
        // newly valid iterator, but not all do.
        return copy.iterator();
    }

    /**
     * Returns the size of the stack.
     */
    public int size() {
        return list.size();
    }
    
    /**
     * Returns the stack as an ArrayList
     */
    public ArrayList<E> toArrayList() {
        return new ArrayList<E>(list);
    }

    public static Integer sumStack(Stack<? extends Integer> stack) {
        Iterator<? extends Integer> iter = stack.iterator();
        Integer sum = 0;

        while (iter.hasNext()) {
            Integer elem = iter.next();
            sum += elem;
        }

        return sum;
    }

    public static void prettyPrint(Stack<?> stack) {
        System.out.print("[");
        if (stack.size() == 0) {
            System.out.println("]");
            return;
        }

        Iterator<?> iter = stack.iterator();

        for (int i = 0; i < stack.size() - 1; i++) {
            System.out.print(iter.next() + " ");
        }

        System.out.println(iter.next() + "]");
    }   

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("hello");
        stack.push("how");
        stack.push("are");
        stack.push("you");
        stack.push("today");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Stack<Integer> nums = new Stack<Integer>();
        nums.push(1);
        nums.push(2);
        nums.push(3);

        prettyPrint(nums);
        System.out.println(Stack.sumStack(nums));
    }

}