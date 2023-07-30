// This is the main class containing the program's entry point.
public class Main {
    public static void main(String[] args) {
        // Create an instance of MyArrayList implementing the IList interface to store integers.
        IList<Integer> list = new MyArrayList<>();

        // Add elements to the list.
        list.add(5);
        list.add(2);
        list.add(7);
        list.add(1);
        list.add(9);

        // Print the list before sorting.
        System.out.print("\n" + "Before sorting: ");
        printList(list);

        // Perform quicksort on the list.
        MySorts.quicksort(list);

        // Print the list after sorting.
        System.out.print("After sorting: ");
        printList(list);
    }

    // Helper method to print the elements of the list.
    private static void printList(IList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}