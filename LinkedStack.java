import java.util.NoSuchElementException;

/**
 * Implementation of a non-circular LinkedStack.
 *
 * @author Mackenzie Williams
 * @version 1.0
 */
public class LinkedStack<T> {

    /*
     * Do not add new instance variables or modify existing ones.
     */
    private LinkedNode<T> head;
    private int size;

    /*
     * Do not add a constructor.
     */

    /**
     * Adds the data to the top of the stack.
     *
     * Must be O(1).
     *
     * @param data the data to add to the top of the stack
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void push(T data) {
        if (data == null) {
            throw new IllegalArgumentException("Cannot add null data to the stack");
        }
        LinkedNode<T> temp = new LinkedNode<>(data, head);
        head = temp;
        size++;
    }

    /**
     * Removes and returns the data from the top of the stack.
     *
     * Must be O(1).
     *
     * @return the data formerly located at the top of the stack
     * @throws java.util.NoSuchElementException if the stack is empty
     */
    public T pop() {
        if (size == 0) {
            throw new NoSuchElementException("Cannot pop from an empty stack");
        }
        T temp = head.getData();
        head = head.getNext();
        size--;
        return temp;
    }

    /**
     * Returns the data from the top of the stack without removing it.
     *
     * Must be O(1).
     *
     * @return the data from the top of the stack
     * @throws java.util.NoSuchElementException if the stack is empty
     */
    public T peek() {
        if (size == 0) {
            throw new NoSuchElementException("The stack is empty; there is nothing to peek");
        }
        return head.getData();
    }

    /**
     * Returns the head node of the stack.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the node at the head of the stack
     */
    public LinkedNode<T> getHead() {
        return head;
    }

    /**
     * Returns the size of the stack.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the size of the stack
     */
    public int size() {
        return size;
    }
}
