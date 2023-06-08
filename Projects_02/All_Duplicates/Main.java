import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements to it
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(3);
        myList.add(2);
        myList.add(3);
        myList.add(1);
        myList.add(4);
        myList.add(2);
        myList.add(1);
        myList.add(3);
        myList.add(0);

        // Call the allDuplicates method to find the duplicate elements in the list
        ArrayList<Integer> duplicates = allDuplicates(myList);

        // Print the duplicate elements
        System.out.println("\n" + duplicates);  // Output: [3, 2, 1]
    }

    /**
     * This method returns an ArrayList containing all the elements in the argument ArrayList
     * that appear more than once.
     *
     * @param myList - An ArrayList of integers.
     * @return An ArrayList containing the duplicate elements.
     */
    public static ArrayList<Integer> allDuplicates(ArrayList<Integer> myList) {
        HashSet<Integer> set = new HashSet<>(); // Create a HashSet to store unique elements
        ArrayList<Integer> duplicates = new ArrayList<>(); // Create an ArrayList to store duplicate elements

        // Iterate over each element in the input list
        for (Integer num : myList) {
            // If the element is already in the set and not yet added to the duplicates list,
            // add it to the duplicates list
            if (!set.add(num) && !duplicates.contains(num)) {
                duplicates.add(num);
            }
        }

        // Return the list of duplicate elements
        return duplicates;
    }
}
