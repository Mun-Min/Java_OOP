// Complete the implementation of your MyArrayList class in this file

import java.util.NoSuchElementException;

public class MyArrayList implements MyList {
    private int capacity = 8; // Initial capacity of the array
    private int size = 0; // Current number of elements in the array
    private Object[] storage = new Object[capacity]; // Array to store the elements

    @Override
    public void addToEnd(Object o) {
        // If the array is already full, double its capacity to accommodate more elements
        if (size == capacity) {
            makeCapacity(capacity * 2);
        }
        // Add the new element to the end of the array and increment the size counter
        storage[size] = o;
        size++;
    }

    @Override
    public void insertAt(int index, Object o) {
        // Check if the given index is within bounds
        if (index < 0 || index > size) {
            throw new NoSuchElementException("Index out of bounds");
        }
        // If the array is already full, double its capacity to accommodate more elements
        if (size == capacity) {
            makeCapacity(capacity * 2);
        }
        // Shift elements to the right to make space for the new element at the given index
        for (int i = size; i > index; i--) {
            storage[i] = storage[i - 1];
        }
        // Insert the new element at the specified index and increment the size counter
        storage[index] = o;
        size++;
    }

    @Override
    public void removeAt(int index) {
        // Check if the given index is within bounds
        if (index < 0 || index >= size) {
            throw new NoSuchElementException("Index out of bounds");
        }
        // Shift elements to the left to fill the gap left by the removed element
        for (int i = index; i < size - 1; i++) {
            storage[i] = storage[i + 1];
        }
        // Set the last element (now duplicated at index size - 1) to null and decrement the size counter
        storage[size - 1] = null;
        size--;
        // If the capacity is more than the default (8) and the size becomes less than half of the capacity,
        // reduce the capacity to save memory.
        if (capacity > 8 && size < capacity / 2) {
            makeCapacity(capacity / 2);
        }
    }

    @Override
    public Object getAt(int index) {
        // Check if the given index is within bounds
        if (index < 0 || index >= size) {
            throw new NoSuchElementException("Index out of bounds");
        }
        // Return the element at the specified index
        return storage[index];
    }

    @Override
    public int getSize() {
        // Return the current number of elements in the array
        return size;
    }

    // A utility method to change the capacity of the array to a minimum specified capacity
    public void makeCapacity(int minCapacity) {
        // If the requested capacity is smaller or equal to the current size, or it's the same as the current capacity,
        // no resizing is needed, so simply return.
        if (minCapacity <= size || minCapacity == capacity) {
            return;
        }
        // Create a new array with the requested capacity and copy the elements from the old array to the new one.
        Object[] newStorage = new Object[minCapacity];
        for (int i = 0; i < size; i++) {
            newStorage[i] = storage[i];
        }
        // Replace the old storage array with the new one and update the capacity.
        storage = newStorage;
        capacity = minCapacity;
    }

    // A utility method to trim the excess capacity, reducing it to the current size.
    public void trimExcess() {
        makeCapacity(size);
    }
   
    // Do not alter the code below 
    @Override
    public MyListIterator getIterator() {
        // Return a new instance of the MyArrayListIterator, allowing iteration over the elements of the array.
        return new MyArrayListIterator();
    }
    
    private class MyArrayListIterator implements MyListIterator {
        int currentIndex = -1;

        @Override
        public Object next() {
            // Move the iterator to the next element and return it.
            currentIndex++;
            return storage[currentIndex];
        }

        @Override
        public boolean hasNext() {
            // Check if there are more elements to iterate over.
            return currentIndex < size - 1;
        }
    }   
}
