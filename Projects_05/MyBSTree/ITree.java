// Define an interface ITree that represents the basic operations of a binary search tree.
public interface ITree<T extends Comparable<T>> {
    // Method to insert an item into the tree.
    public void insert(T item);

    // Method to check if the tree contains a specific item.
    public boolean containsItem(T item);

    // Method to get the size of the tree (number of elements).
    public int getSize();

    // Method to print the tree in order (ascending order).
    public void printInOrder();

    // Method to represent the tree as a string (in-order traversal result as a string).
    public String toString();
}
