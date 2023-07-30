// The IList interface defines the contract for a generic list data structure.
// It provides methods for adding, getting, setting, inserting, and removing elements from the list.
public interface IList<T extends Comparable<T>> {
    // Adds an element at the end of the list.
    public void add(T item);

    // Stores a new item at a specified index. Throws NoSuchElementException if the index is out of bounds.
    public void set(int index, T item);

    // Inserts an element at the specified index. Throws NoSuchElementException if the index is out of bounds.
    public void insert(int index, T item);

    // Removes the element at the specified index. Throws NoSuchElementException if the index is out of bounds.
    public void remove(int index);

    // Returns the element at the specified index. Throws NoSuchElementException if the index is out of bounds.
    public T get(int index);

    // Returns the size of the list. It indicates the number of elements in the list.
    public int size();
}