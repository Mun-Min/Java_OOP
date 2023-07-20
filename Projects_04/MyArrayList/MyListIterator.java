/**
 * A list iterator allows access to a position in a list and provides a way to traverse through the list elements.
 * This interface contains a subset of the methods of the standard java.util.ListIterator interface.
 * The methods for backward traversal are not included to keep the interface simple and focused on forward traversal.
 */
public interface MyListIterator {

    /**
     * Moves the iterator to the next element in the list and returns the traversed element.
     *
     * @return the traversed element
     * @throws NoSuchElementException if there are no more elements to traverse in the list
     */
    Object next();

    /**
     * Checks if there is an element after the current iterator position in the list.
     *
     * @return true if there is an element after the iterator position, false otherwise
     */
    boolean hasNext();
}

// Additional comments:
// - The interface "MyListIterator" is intended to provide a simplified version of the standard java.util.ListIterator.

// - It allows iterating over elements in a list, but it does not support backward traversal.

// - The "next" method is used to move the iterator to the next element and return that element. If no more elements are available,
//   it throws a NoSuchElementException to indicate that the end of the list has been reached.

// - The "hasNext" method is used to check if there is an element after the current iterator position in the list. It returns true if
//   there is another element available, and false otherwise. This method is useful to avoid attempting to access an element when the
//   iterator has reached the end of the list.