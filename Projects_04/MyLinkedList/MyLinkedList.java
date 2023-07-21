// Import the necessary exception for handling cases when elements are not found.
import java.util.NoSuchElementException;

public class MyLinkedList implements MyList {
    // Define the required fields for the linked list.
    private Node head; // Points to the first element of the linked list.
    private int size; // Stores the number of elements in the linked list.

    // Constructor to initialize the linked list.
    public MyLinkedList() {
        head = null; // Initially, the linked list is empty, so the head points to null.
        size = 0; // The size of the linked list is zero.
    }

    // Add an element to the end of the linked list.
    public void addToEnd(Object o) {
        Node newNode = new Node(); // Create a new node for the new element.
        newNode.data = o; // Assign the data value to the new node.

        if (head == null) {
            // If the linked list is empty, make the new node the head.
            head = newNode;
        } else {
            // If the linked list is not empty, traverse to the last node and add the new node.
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        size++; // Increase the size of the linked list.
    }

    // Insert an element at the specified index in the linked list.
    public void insertAt(int index, Object o) {
        if (index < 0 || index > size) {
            throw new NoSuchElementException("Index out of bounds");
        }

        Node newNode = new Node(); // Create a new node for the new element.
        newNode.data = o; // Assign the data value to the new node.

        if (index == 0) {
            // If the index is 0, make the new node the head.
            newNode.next = head;
            head = newNode;
        } else {
            // If the index is greater than 0, traverse to the node at index - 1 and add the new node.
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }

        size++; // Increase the size of the linked list.
    }

    // Remove the element at the specified index from the linked list.
    public void removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new NoSuchElementException("Index out of bounds");
        }

        if (index == 0) {
            // If the index is 0, update the head to point to the next node.
            head = head.next;
        } else {
            // If the index is greater than 0, traverse to the node at index - 1 and update its 'next' pointer.
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }

        size--; // Decrease the size of the linked list.
    }

    // Get the element at the specified index from the linked list.
    public Object getAt(int index) {
        if (index < 0 || index >= size) {
            throw new NoSuchElementException("Index out of bounds");
        }

        // Traverse to the node at the specified index and return its data.
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

    // Get the size of the linked list.
    public int getSize() {
        return size;
    }

    // Do not alter the code below

    // Get an iterator for the linked list to traverse through its elements.
    public MyListIterator getIterator() {
        return new MyLinkedListIterator();
    }

    // Private inner class to implement the iterator for the linked list.
    private class MyLinkedListIterator implements MyListIterator {
        Node currentNode = null;

        // Get the next element in the linked list.
        @Override
        public Object next() {
            if (currentNode != null)
                currentNode = currentNode.next;
            else
                currentNode = head;

            return currentNode.data;
        }

        // Check if there are more elements in the linked list to iterate.
        @Override
        public boolean hasNext() {
            if (currentNode != null)
                return currentNode.next != null;
            else
                return head != null;
        }
    }

    // Private inner class to represent a node in the linked list.
    class Node {
        public Object data = null;
        public Node next = null;
    }
}
