import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Create the first ArrayList and add elements to it
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        // Create the second ArrayList and add elements to it
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(0);
        list2.add(2);
        list2.add(9);
        list2.add(3);

        // Call the 'inBoth' method to find elements that are in both lists
        ArrayList<Integer> result = inBoth(list1, list2);

        // Print the result
        System.out.println("\n" + result); // Output: [2, 3]
    }
  
    /**
     * This method returns an ArrayList containing all the elements that are present in both argument ArrayList objects.
     *
     * @param list1 The first ArrayList
     * @param list2 The second ArrayList
     * @return ArrayList containing the elements common to both list1 and list2
     */
    public static ArrayList<Integer> inBoth(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> result = new ArrayList<>(); // ArrayList to store the common elements

        // Iterate over each element in list1
        for (Integer num : list1) {
            // Check if the element is present in list2 and not already in the result ArrayList
            if (list2.contains(num) && !result.contains(num)) {
                // Add the element to the result ArrayList
                result.add(num);
            }
        }

        // Return the ArrayList containing the common elements
        return result;
    }
}
