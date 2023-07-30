// MyArrayList class implements the IList interface with a generic type T.
// In this case, T is restricted to Comparable, ensuring the elements can be compared for sorting.
import java.util.ArrayList;

public class MyArrayList<T extends Comparable<T>> implements IList<T> {
    private ArrayList<T> list = new ArrayList<T>();

    @Override
    public void add(T item) {
        // Add the item to the underlying ArrayList.
        list.add(item);
    }

    @Override
    public int size() {
        // Return the size of the list.
        return list.size();
    }

    @Override
    public T get(int index) {
        // Retrieve the element at the specified index from the underlying ArrayList.
        return list.get(index);
    }

    @Override
    public void set(int index, T item) {
        // Replace the element at the specified index with the given item.
        list.set(index, item);
    }

    @Override
    public void insert(int index, T item) {
        // Insert the item at the specified index, shifting other elements if necessary.
        list.add(index, item);
    }

    @Override
    public void remove(int index) {
        // Remove the element at the specified index from the underlying ArrayList.
        list.remove(index);
    }
}
