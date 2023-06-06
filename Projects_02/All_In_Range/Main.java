import java.util.ArrayList;

/**
 * This program demonstrates the usage of the 'inRange' method.
 * The 'inRange' method returns an ArrayList containing all the elements in the argument ArrayList
 * that are between the second argument value and the third argument value (inclusive).
 */
public class Main {
    public static ArrayList<Integer> inRange(ArrayList<Integer> myList, int min, int max) {
        // Create a new ArrayList to store the elements that fall within the specified range
        ArrayList<Integer> result = new ArrayList<>();

        // Iterate through each element in the input ArrayList
        for (Integer num : myList) {
            // Check if the current element is within the range
            if (num >= min && num <= max) {
                // If it is, add it to the result ArrayList
                result.add(num);
            }
        }

        // Return the ArrayList containing the elements in the specified range
        return result;
    }

    public static void main(String[] args) {
        // Create a new ArrayList and populate it with some values
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        // Call the 'inRange' method with the specified range and print the result
        ArrayList<Integer> result = inRange(myList, 2, 4);
        System.out.println("\n" + result + "\n");  // [2, 3, 4]

        // Clear the ArrayList and add new values
        myList.clear();
        myList.add(3);
        myList.add(7);
        myList.add(6);
        myList.add(2);
        myList.add(9);
        myList.add(0);
        myList.add(4);
        myList.add(8);

        // Call the 'inRange' method with a different range and print the result
        result = inRange(myList, 3, 10);
        System.out.println(result + "\n");  // [3, 7, 6, 9, 4, 8]

        // Clear the ArrayList and add identical values
        myList.clear();
        myList.add(1);
        myList.add(1);
        myList.add(1);

        // Call the 'inRange' method with a single value as the range and print the result
        result = inRange(myList, 1, 1);
        System.out.println(result + "\n");  // [1, 1, 1]
    }
}
