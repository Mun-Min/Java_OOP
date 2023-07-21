// This is the main class where we can test our MyLinkedList class.

public class Main {
    public static void main(String[] args) {
        // Create a new instance of MyLinkedList
        // Here, we are creating an empty linked list instance.
        MyList myList = new MyLinkedList();

        // Add elements to the end of the list
        // We add three elements (1, 2, and 3) to the end of the linked list.
        myList.addToEnd(1);
        myList.addToEnd(2);
        myList.addToEnd(3);

        // Insert an element at index 1
        // We insert the value 99 at index 1, shifting elements as needed.
        myList.insertAt(1, 99);

        // Remove the element at index 2
        // We remove the element at index 2 (which is '2' after adding 99),
        // so the list becomes [1, 99, 3].
        myList.removeAt(2);

        // Print the elements in the list
        // We create an iterator to traverse the linked list and print each element.
        // The output will be: "1\n99\n3"
        System.out.println();

        MyListIterator iterator = myList.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Get the element at index 1
        // We get the element at index 1 (which is '99') and store it in the 'element' variable.
        Object element = myList.getAt(1);
        System.out.println("\n" + "Element at index 1: " + element);

        // Get the size of the list
        // We retrieve the size of the linked list (which is 3) and store it in the 'size' variable.
        int size = myList.getSize();
        System.out.println("Size of the list: " + size);
    }
}
