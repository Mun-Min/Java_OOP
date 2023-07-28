import java.util.NoSuchElementException;

/**
 * A class that implements the 'IStack' interface to create a stack data structure.
 */
public class MyStack implements IStack {
    private Object[] stack; // Array to store the elements of the stack.
    private int top; // Index of the top element in the stack.

    /**
     * Constructor to initialize the 'MyStack' object.
     * Initializes the stack with a default size of 10 and sets the top index to -1 (indicating an empty stack).
     */
    public MyStack() {
        stack = new Object[10];
        top = -1;
    }

    /**
     * Adds the given item to the top of the stack.
     * If the stack is full, the size of the stack is doubled by expanding the underlying array.
     *
     * @param item The item to be pushed onto the stack.
     */
    @Override
    public void push(Object item) {
        if (top == stack.length - 1) {
            expandStack(); // Expand the stack size if it is full.
        }
        stack[++top] = item; // Increment the top index and insert the item at the new top position.
    }

    /**
     * Removes and returns the item at the top of the stack.
     *
     * @return The item at the top of the stack.
     * @throws NoSuchElementException if the stack is empty and there are no elements to pop.
     */
    @Override
    public Object pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty"); // Throw an exception if the stack is empty.
        }
        Object item = stack[top]; // Get the item at the top of the stack.
        stack[top--] = null; // Decrement the top index and remove the item from the stack to avoid memory leaks.
        return item; // Return the popped item.
    }

    /**
     * Returns the item at the top of the stack without removing it.
     *
     * @return The item at the top of the stack.
     * @throws NoSuchElementException if the stack is empty and there are no elements to peek.
     */
    @Override
    public Object peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty"); // Throw an exception if the stack is empty.
        }
        return stack[top]; // Return the item at the top of the stack.
    }

    /**
     * Searches for the given item in the stack and returns its index.
     *
     * @param item The item to be searched for in the stack.
     * @return The zero-based index of the item in the stack; returns -1 if the item is not in the stack.
     */
    @Override
    public int indexOf(Object item) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].equals(item)) {
                return top - i; // Return the distance from the top of the stack to the found item.
            }
        }
        return -1; // Return -1 if the item is not found in the stack.
    }

    /**
     * Returns the number of items in the stack.
     *
     * @return A count of the number of items in the stack.
     */
    @Override
    public int size() {
        return top + 1; // The size of the stack is the top index + 1.
    }

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty; otherwise, false.
     */
    @Override
    public boolean isEmpty() {
        return top == -1; // If the top index is -1, the stack is empty.
    }

    /**
     * Expands the size of the stack by creating a new array with double the capacity and copying elements from the old stack.
     * This method is called when the stack is full and a new element needs to be pushed.
     */
    private void expandStack() {
        Object[] newStack = new Object[stack.length * 2]; // Create a new array with double the capacity.
        System.arraycopy(stack, 0, newStack, 0, stack.length); // Copy elements from the old stack to the new stack.
        stack = newStack; // Replace the old stack with the expanded stack.
    }
}