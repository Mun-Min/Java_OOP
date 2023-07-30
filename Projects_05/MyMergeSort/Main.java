// Main class to test the MyArrayList and MySorts classes
public class Main {
    public static void main(String[] args) {
        // Create a new instance of MyArrayList
        IList<Integer> list = new MyArrayList<>();

        // Add some elements to the list
        list.add(5);
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(10);

        // Print the original list
        System.out.println("\n" + "Original list: " + listToString(list));

        // Sort the list using merge sort
        MySorts.mergesort(list);

        // Print the sorted list
        System.out.println("Sorted list: " + listToString(list));
    }

    // Helper method to convert IList to a string representation
    private static String listToString(IList<Integer> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i != list.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
