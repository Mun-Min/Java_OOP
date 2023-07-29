// Define a class MyBSTree that implements the ITree interface, representing a binary search tree.
public class MyBSTree<T extends Comparable<T>> implements ITree<T> {

    // Inner class Node represents a node in the binary search tree.
    private class Node {
        public T data;
        public Node left;
        public Node right;

        // Constructor to create a node with the given data.
        public Node(T data) {
            this.data = data;
            left = null;
            right = null;
        }

        // Insert a new item into the subtree rooted at this node.
        public void insert(T item) {
            if (item.compareTo(data) < 0) {
                // If the item is less than the current node's data, go left.
                if (left == null) {
                    // If the left child is null, create a new node and make it the left child.
                    left = new Node(item);
                } else {
                    // If the left child is not null, recursively insert the item to the left subtree.
                    left.insert(item);
                }
            } else if (item.compareTo(data) > 0) {
                // If the item is greater than the current node's data, go right.
                if (right == null) {
                    // If the right child is null, create a new node and make it the right child.
                    right = new Node(item);
                } else {
                    // If the right child is not null, recursively insert the item to the right subtree.
                    right.insert(item);
                }
            }
        }
    }

    private Node root; // The root node of the binary search tree.
    private int size; // The number of elements in the tree.

    // Method to insert an item into the binary search tree.
    public void insert(T item) {
        if (root == null) {
            // If the tree is empty, create a new root node with the given item.
            root = new Node(item);
        } else {
            // If the tree is not empty, insert the item into the appropriate position in the tree.
            root.insert(item);
        }
        size++; // Increment the size of the tree.
    }

    // Method to check if the tree contains a specific item.
    public boolean containsItem(T item) {
        // Use the private helper method findNode to search for the item in the tree.
        return findNode(item) != null;
    }

    // Private helper method to find a node containing the given item in the binary search tree.
    private Node findNode(T item) {
        Node current = root; // Start the search from the root node.
        while (current != null) {
            int cmp = item.compareTo(current.data);
            if (cmp < 0) {
                // If the item is less than the current node's data, go left.
                current = current.left;
            } else if (cmp > 0) {
                // If the item is greater than the current node's data, go right.
                current = current.right;
            } else {
                // If the item is equal to the current node's data, we found the node containing the item.
                return current;
            }
        }
        // If the item is not found in the tree, return null.
        return null;
    }

    // Method to get the size of the binary search tree (number of elements).
    public int getSize() {
        return size;
    }

    // Private helper method for in-order traversal of the binary search tree.
    private void inOrderTraversal(Node node) {
        if (node != null) {
            // Recursively visit the left subtree.
            inOrderTraversal(node.left);

            // Process the current node (print its data).
            System.out.print(node.data + " ");

            // Recursively visit the right subtree.
            inOrderTraversal(node.right);
        }
    }

    // Method to print the binary search tree in order (ascending order).
    public void printInOrder() {
        // Start the in-order traversal from the root node.
        inOrderTraversal(root);
        System.out.println(); // Move to the next line after printing.
    }

    // Private helper method to append nodes to a StringBuilder during in-order traversal.
    private void appendInOrder(Node node, StringBuilder sb) {
        if (node != null) {
            // Recursively append the left subtree.
            appendInOrder(node.left, sb);

            // Append the current node's data to the StringBuilder.
            sb.append(node.data).append(" ");

            // Recursively append the right subtree.
            appendInOrder(node.right, sb);
        }
    }

    // Method to represent the binary search tree as a string (in-order traversal result as a string).
    public String toString() {
        StringBuilder sb = new StringBuilder();
        // Start the in-order traversal from the root node and append nodes to the StringBuilder.
        appendInOrder(root, sb);
        return sb.toString().trim(); // Convert the StringBuilder to a string and remove trailing spaces.
    }
}