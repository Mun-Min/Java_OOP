/**
 * This interface specifies the basic operations of any list-like object.
 * This interface contains a variation of the methods of the
 * standard java.util.List interface.
 */
public interface MyList {

    /**
     * Adds an element at the end of the list.
     *
     * @param o the element to be added to the end of the list
     */
    public void addToEnd(Object o);

    /**
     * Inserts an element at the specified index.
     * Throws NoSuchElementException if the index is out of bounds.
     *
     * @param index the index at which the element should be inserted
     * @param o     the element to be inserted at the specified index
     */
    public void insertAt(int index, Object o);

    /**
     * Removes the element at the specified index.
     * Throws NoSuchElementException if the index is out of bounds.
     *
     * @param index the index of the element to be removed
     */
    public void removeAt(int index);

    /**
     * Returns the element at the specified index.
     * Throws NoSuchElementException if the index is out of bounds.
     *
     * @param index the index of the element to be retrieved
     * @return the element at the specified index
     */
    public Object getAt(int index);

    /**
     * Returns the size of the list.
     *
     * @return the number of elements in the list
     */
    public int getSize();

    /**
     * Returns a list iterator for this list.
     *
     * @return a list iterator for this list
     */
    public MyListIterator getIterator();
}
