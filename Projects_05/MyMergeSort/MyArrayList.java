// Implementation of MyArrayList that implements the IList interface
import java.util.ArrayList;

public class MyArrayList<T extends Comparable<T>> implements IList<T> {
    private ArrayList<T> list = new ArrayList<T>();

    // Adds an element at the end of the list
    @Override
    public void add(T item) {
        list.add(item);
    }

    // Returns the number of elements in the list
    @Override
    public int size() {
        return list.size();
    }

    // Retrieves the element at the specified index
    @Override
    public T get(int index) {
        return list.get(index);
    }

    // Sets the element at the specified index to a new value
    @Override
    public void set(int index, T item) {
        list.set(index, item);
    }

    // Inserts an element at the specified index
    @Override
    public void insert(int index, T item) {
        list.add(index, item);
    }

    // Removes the element at the specified index
    @Override
    public void remove(int index) {
        list.remove(index);
    }
}