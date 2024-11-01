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
        return toArrayList().iterator();
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
        ArrayList<E> copy = new ArrayList<E>(list);
        Collections.reverse(copy);

        return copy;
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

    public static void prettyPrint(Stack<?> stack) {}
        

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
        nums.push(1);
        nums.push(1);
        System.out.println(Stack.sumStack(nums));
        prettyPrint(stack);
    }

}