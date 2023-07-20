/**
 * This interface specifies the basic operations of any list-like object.
 * It is designed to provide a set of common methods for manipulating a list
 * of elements, similar to the standard java.util.List interface.
 * Any class that implements this interface is expected to provide
 * concrete implementations of these methods to manipulate the list contents.
 */

public interface MyList {

    /**
     * Adds an element at the end of the list.
     * The element will be appended to the current list, becoming its last element.
     *
     * @param o The object to be added to the end of the list.
     */
    public void addToEnd(Object o);

    /**
     * Inserts an element at the specified index.
     * The given element will be inserted at the provided index, shifting the subsequent
     * elements to the right. If the index is out of bounds (less than 0 or greater than
     * the current list size), a NoSuchElementException is thrown.
     *
     * @param index The index at which the element should be inserted.
     * @param o     The object to be inserted into the list.
     * @throws NoSuchElementException if the index is out of bounds.
     */
    public void insertAt(int index, Object o);

    /**
     * Removes the element at the specified index.
     * The element at the given index will be removed from the list, and the subsequent
     * elements will be shifted to the left to fill the gap. If the index is out of bounds
     * (less than 0 or greater than or equal to the current list size), a
     * NoSuchElementException is thrown.
     *
     * @param index The index of the element to be removed.
     * @throws NoSuchElementException if the index is out of bounds.
     */
    public void removeAt(int index);

    /**
     * Returns the element at the specified index.
     * This method retrieves and returns the element at the given index in the list.
     * If the index is out of bounds (less than 0 or greater than or equal to the current
     * list size), a NoSuchElementException is thrown.
     *
     * @param index The index of the element to retrieve.
     * @return The object at the specified index in the list.
     * @throws NoSuchElementException if the index is out of bounds.
     */
    public Object getAt(int index);

    /**
     * Returns the size of the list.
     *
     * @return The number of elements in the list.
     */
    public int getSize();

    /**
     * Returns a list iterator for this list.
     * A list iterator provides a way to traverse the elements in the list sequentially.
     * The list iterator starts at the beginning of the list (index 0) and can be used to
     * access elements and iterate through the list.
     *
     * @return A list iterator for this list.
     */
    public MyListIterator getIterator();
}
