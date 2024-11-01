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
public class StringStack implements Iterable<String> {
    private List<String> elements = new ArrayList<String>();

    /**
     * Pushes an element onto the top of the stack.
     * 
     * @param element
     */
    public void push(String element) {
        elements.add(element);
    }

    /**
     * Removes the top element of the stack, and returns that element.
     * 
     * @precondition The stack is not empty.
     */
    public String pop() {
        String back = peek();
        elements.remove(elements.size() - 1);
        return back;
    }

    /**
     * Returns the top element of the stack, without removing it.
     */
    public String peek() {
        String back = elements.get(elements.size() - 1);
        return back;
    }

    /**
     * Returns an iterator to the internal data structure of the stack.
     */
    public Iterator<String> iterator() {
        List<String> copy = new ArrayList<String>(elements);
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
    public ArrayList<String> toArrayList() {
        ArrayList<String> copy = new ArrayList<String>(elements); // important here that we don't return a pointer and give the
                                                        // user the keys!!
        return copy;
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
        StringStack stack = new StringStack();
        stack.push("hi");
        stack.push("hello");
        stack.push("hey");
        stack.push("bye");
        stack.push("goodbye");
        stack.prettyPrint();
    }
}

