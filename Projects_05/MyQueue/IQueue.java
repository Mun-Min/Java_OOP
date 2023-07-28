/**
 * An interface representing a queue data structure.
 * A queue is a first in first out (FIFO) data structure.
 * New items are added to the end of the list, and items are removed from the front of the list.
 */
public interface IQueue {

    /**
     * Inserts the specified element at the end of this queue.
     *
     * @param item The item to be enqueued into the queue.
     */
    public void enqueue(Object item);

    /**
     * Retrieves and removes the head of this queue.
     *
     * @return The first item in the queue.
     * @throws NoSuchElementException If the queue is empty.
     */
    public Object dequeue();

    /**
     * Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
     *
     * @return The first item in this queue or null if the queue is empty.
     */
    public Object peek();

    /**
     * Searches the queue for an item and returns its index.
     *
     * @param item The item to search for in the queue.
     * @return The zero-based index of the item in the queue; returns -1 if the item is not in the queue.
     */
    public int indexOf(Object item);

    /**
     * Returns the number of items in the queue.
     *
     * @return A count of the number of items in the queue.
     */
    public int size();

    /**
     * Checks if this queue is empty.
     *
     * @return true if the queue is empty, false otherwise.
     */
    public boolean isEmpty();
}