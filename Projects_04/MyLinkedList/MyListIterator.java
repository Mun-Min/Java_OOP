/**
 * A list iterator allows access to a position in a list.
 * This interface contains a subset of the methods of the
 * standard java.util.ListIterator interface. The methods for
 * backward traversal are not included.
 */
public interface MyListIterator {

    /**
     * Moves the iterator past the next element.
     * @return the traversed element
     */
    Object next();

    /**
     * Tests if there is an element after the iterator position.
     * @return true if there is an element after the iterator position, false otherwise
     */
    boolean hasNext();
}
