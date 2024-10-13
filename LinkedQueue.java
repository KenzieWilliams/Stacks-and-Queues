import java.util.NoSuchElementException;

/**
 * Implementation of a non-circular LinkedQueue. It should NOT be circular.
 *
 * @author Mackenzie Williams
 * @version 1.0
 */
public class LinkedQueue<T> {
    private LinkedNode<T> head;
    private LinkedNode<T> tail;
    private int size;

    /**
     * Adds the data to the back of the queue.
     *
     * Must be O(1).
     *
     * @param data the data to add to the back of the queue
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void enqueue(T data) {
        if (data == null) {
            throw new IllegalArgumentException("Cannot add null data to this queue");
        }
        if (size == 0) {
            head = new LinkedNode<T>(data, null);
            tail = head;
        } else {
            tail.setNext(new LinkedNode<T>(data, null));
            tail = tail.getNext();
        }
        size++;
    }

    /**
     * Removes and returns the data from the front of the queue.
     *
     * Must be O(1).
     *
     * @return the data formerly located at the front of the queue
     * @throws java.util.NoSuchElementException if the queue is empty
     */
    public T dequeue() {
        if (size == 0) {
            throw new NoSuchElementException("This queue is empty, there is nothing to dequeue");
        }
        T temp = head.getData();
        head = head.getNext();
        size--;
        if (size == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    /**
     * Returns the data from the front of the queue without removing it.
     *
     * Must be O(1).
     *
     * @return the data located at the front of the queue
     * @throws java.util.NoSuchElementException if the queue is empty
     */
    public T peek() {
        if (size == 0) {
            throw new NoSuchElementException("This queue is empty; there is nothing to peek");
        }
        return head.getData();
    }

    /**
     * Returns the head node of the queue.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the node at the head of the queue
     */
    public LinkedNode<T> getHead() {
        return head;
    }

    /**
     * Returns the tail node of the queue.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the node at the tail of the queue
     */
    public LinkedNode<T> getTail() {
        return tail;
    }

    /**
     * Returns the size of the queue.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the size of the queue
     */
    public int size() {
        return size;
    }
}
