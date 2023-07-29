// Define a public class Main to contain the main method to execute the program.
public class Main {
    public static void main(String[] args) {
        // Create an instance of MyBSTree<Integer> to work with the binary search tree.
        MyBSTree<Integer> tree = new MyBSTree<>();

        // Inserting elements into the binary search tree.
        tree.insert(8);
        tree.insert(3);
        tree.insert(10);
        tree.insert(1);
        tree.insert(6);
        tree.insert(14);
        tree.insert(4);
        tree.insert(7);
        tree.insert(13);

        // Print the tree in order (ascending order).
        System.out.print("\n" + "In-order traversal: ");
        tree.printInOrder();

        // Check if the tree contains specific items.
        System.out.println("Contains 6: " + tree.containsItem(6));
        System.out.println("Contains 9: " + tree.containsItem(9));

        // Get the size of the tree (number of elements).
        System.out.println("Size of the tree: " + tree.getSize());

        // Print the tree as a string (in-order traversal result as a space-separated string).
        System.out.println("Tree as string: " + tree.toString());
    }
}