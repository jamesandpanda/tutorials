package naive_stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * A Simple Stack.
 * 
 * @param <E>
 * 
 * @author Nick Patrikeos
 */
public class IntegerStack implements Iterable<Integer> {
    private List<Integer> elements = new ArrayList<Integer>();

    /**
     * Pushes an element onto the top of the stack.
     * 
     * @param element
     */
    public void push(Integer element) {
        elements.add(element);
    }

    /**
     * Removes the top element of the stack, and returns that element.
     * 
     * @precondition The stack is not empty.
     */
    public Integer pop() {
        Integer back = peek();
        elements.remove(elements.size() - 1);
        return back;
    }

    /**
     * Returns the top element of the stack, without removing it.
     */
    public Integer peek() {
        Integer back = elements.get(elements.size() - 1);
        return back;
    }

    /**
     * Returns an iterator to the internal data structure of the stack.
     */
    public Iterator<Integer> iterator() {
        List<Integer> copy = new ArrayList<Integer>(elements);
        Collections.reverse(copy);
        return copy.iterator();
    }

    /**
     * Returns the size of the stack.
     */
    public int size() {
        return elements.size();
    }

    /**
     * Returns the stack as an ArrayList
     */
    public ArrayList<Integer> toArrayList() {
        ArrayList<Integer> copy = new ArrayList<Integer>(elements); // important here that we don't return a pointer and give the
                                                        // user the keys!!
        return copy;
    }

    public Integer sumStack() {
        int total = 0;
        for (Integer element : elements) {
            total += element;
        }
        return total;
    }

    public void prettyPrint() {
        System.out.print("[");
        if (elements.size() == 0) {
            System.out.println("]");
        }

        Iterator<?> iter = elements.iterator();

        for (int i = 0; i < elements.size() - 1; i++) {
            System.out.print(iter.next() + " ");
        }
        System.out.println(iter.next() + "]");
    }

    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack();
        stack.push(1);
        stack.push(5);
        stack.push(-2);
        stack.push(10);
        stack.push(4);
        stack.prettyPrint();
    }
}

