// This is the main class that contains the test code to evaluate the MyArrayList class.

public class Main {
    public static void main(String[] args) {
        // Create an instance of the MyArrayList class using the MyList interface reference.
        MyList myList = new MyArrayList();

        // Test the addToEnd method of MyArrayList.
        // Add elements to the end of the list.
        myList.addToEnd(1);
        myList.addToEnd(2);
        myList.addToEnd(3);
        myList.addToEnd(4);
        myList.addToEnd(5);
        // Output: [1, 2, 3, 4, 5]
        printList(myList);

        // Test the insertAt method of MyArrayList.
        // Insert elements at specific positions in the list.
        myList.insertAt(2, 99); // Insert 99 at index 2.
        myList.insertAt(0, 100); // Insert 100 at index 0.
        // Output: [100, 1, 2, 99, 3, 4, 5]
        printList(myList);

        // Test the removeAt method of MyArrayList.
        // Remove elements at specific positions from the list.
        myList.removeAt(3); // Remove the element at index 3 (which is 99).
        myList.removeAt(0); // Remove the element at index 0 (which is 100).
        // Output: [1, 2, 99, 4, 5]
        printList(myList);

        // Test the getAt method of MyArrayList.
        // Get the element at a specific index in the list.
        System.out.println(myList.getAt(2)); // Output: 99

        // Test the getSize method of MyArrayList.
        // Get the current size of the list.
        System.out.println(myList.getSize()); // Output: 5
    }

    // Helper method to print the elements of the MyList using an iterator.
    private static void printList(MyList myList) {
        // Get an iterator to traverse through the elements of the list.
        MyListIterator iterator = myList.getIterator();
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        // Iterate through the list and append elements to the StringBuilder.
        while (iterator.hasNext()) {
            sb.append(iterator.next()).append(", ");
        }
        // If the list is not empty, remove the trailing comma and space.
        if (myList.getSize() > 0) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        // Print the final formatted string representing the list.
        System.out.println("\n" + sb.toString());
    }
}
