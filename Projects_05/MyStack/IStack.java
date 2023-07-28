/**
 * An interface that defines the contract for a Stack data structure.
 * A stack is a last in, first out (LIFO) data structure.
 * New items are pushed onto the top of the stack, and items are popped from the top of the stack.
 */
public interface IStack {
    /**
     * Pushes an item onto the top of this stack.
     *
     * @param item The item to be pushed onto the stack.
     */
    public void push(Object item);

    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     *
     * @return The item at the top of the stack.
     * @throws NoSuchElementException if the stack is empty.
     */
    public Object pop();

    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     *
     * @return The item at the top of the stack.
     * @throws NoSuchElementException if the stack is empty.
     */
    public Object peek();

    /**
     * Searches the stack for an item.
     *
     * @param item The item to search for in the stack.
     * @return The zero-based index of the item in the stack; returns -1 if the item is not in the stack.
     */
    public int indexOf(Object item);

    /**
     * Returns the number of items in the stack.
     *
     * @return A count of the number of items in the stack.
     */
    public int size();

    /**
     * Tests if this stack is empty.
     *
     * @return true if the stack is empty; otherwise, false.
     */
    public boolean isEmpty();
}
