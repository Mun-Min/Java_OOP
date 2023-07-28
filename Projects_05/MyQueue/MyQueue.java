/**
 * The MyQueue class implements a simple queue data structure using an array.
 * It follows the first in first out (FIFO) principle.
 */
import java.util.NoSuchElementException;

public class MyQueue implements IQueue {
    private Object[] elements;
    private int front;
    private int rear;
    private int size;

    /**
     * Constructor to create a new instance of MyQueue with initial capacity 10.
     */
    public MyQueue() {
        elements = new Object[10];
        front = 0;
        rear = -1;
        size = 0;
    }

    /**
     * Inserts the specified element at the end of this queue.
     *
     * @param item The item to be enqueued into the queue.
     */
    @Override
    public void enqueue(Object item) {
        // If the array is full, resize it to accommodate more elements
        if (size == elements.length) {
            resize();
        }
        // Increment rear index in a circular manner and add the item
        rear = (rear + 1) % elements.length;
        elements[rear] = item;
        size++;
    }

    /**
     * Retrieves and removes the head of this queue.
     *
     * @return The first item in the queue.
     * @throws NoSuchElementException If the queue is empty.
     */
    @Override
    public Object dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        // Get the front item, increment front index in a circular manner, and reduce the size
        Object item = elements[front];
        front = (front + 1) % elements.length;
        size--;
        return item;
    }

    /**
     * Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
     *
     * @return The first item in this queue or null if the queue is empty.
     */
    @Override
    public Object peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        // Return the front item without removing it
        return elements[front];
    }

    /**
     * Searches the queue for an item and returns its index.
     *
     * @param item The item to search for in the queue.
     * @return The zero-based index of the item in the queue; returns -1 if the item is not in the queue.
     */
    @Override
    public int indexOf(Object item) {
        // Loop through the elements in the queue and find the index of the item
        for (int i = 0; i < size; i++) {
            int index = (front + i) % elements.length;
            if (elements[index].equals(item)) {
                return i;
            }
        }
        // If the item is not found, return -1
        return -1;
    }

    /**
     * Returns the number of items in the queue.
     *
     * @return A count of the number of items in the queue.
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Checks if the queue is empty.
     *
     * @return true if the queue is empty, false otherwise.
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Resizes the internal array to accommodate more elements when the queue is full.
     */
    private void resize() {
        // Create a new array with double the capacity
        Object[] newElements = new Object[elements.length * 2];
        // Copy the elements from the old array to the new array
        for (int i = 0; i < size; i++) {
            int index = (front + i) % elements.length;
            newElements[i] = elements[index];
        }
        // Update the reference to the new array, reset front and rear indices
        elements = newElements;
        front = 0;
        rear = size - 1;
    }
}