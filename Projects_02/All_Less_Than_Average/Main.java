import java.util.ArrayList;

public class Main {

   /**
    * This method returns an ArrayList containing all the elements in the input ArrayList that are less than the average of all the values in the input ArrayList.
    *
    * @param numbers The input ArrayList of integers.
    * @return An ArrayList containing elements less than the average.
    */
    public static ArrayList<Integer> lessThanAverage(ArrayList<Integer> numbers) {
        ArrayList<Integer> result = new ArrayList<>();
        
        // Return an empty ArrayList if the input list is empty
        if (numbers.isEmpty()) {
            return result;
        }
        
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        double average = (double) sum / numbers.size(); // Calculate the average of the numbers
        
        // Iterate over the numbers and add the ones that are less than the average to the result ArrayList
        for (int number : numbers) {
            if (number < average) {
                result.add(number);
            }
        }
        
        return result; // Return the ArrayList containing elements less than the average
    }

    public static void main(String[] args) {
        // Example 1
        ArrayList<Integer> myList1 = new ArrayList<>();
        myList1.add(1);
        myList1.add(2);
        myList1.add(3);
        myList1.add(4);
        myList1.add(5);
        ArrayList<Integer> result1 = lessThanAverage(myList1);
        System.out.println("\nResult 1: " + result1); // Output: [1, 2]

        // Example 2
        ArrayList<Integer> myList2 = new ArrayList<>();
        myList2.add(3);
        myList2.add(7);
        myList2.add(6);
        myList2.add(2);
        myList2.add(9);
        myList2.add(0);
        myList2.add(4);
        myList2.add(8);
        ArrayList<Integer> result2 = lessThanAverage(myList2);
        System.out.println("\nResult 2: " + result2); // Output: [3, 2, 0, 4]

        // Example 3
        ArrayList<Integer> myList3 = new ArrayList<>();
        myList3.add(1);
        myList3.add(1);
        myList3.add(1);
        ArrayList<Integer> result3 = lessThanAverage(myList3);
        System.out.println("\nResult 3: " + result3); // Output: []
        
        // Example 4
        ArrayList<Integer> myList4 = new ArrayList<>();
        myList4.add(15);
        myList4.add(10);
        myList4.add(5);
        ArrayList<Integer> result4 = lessThanAverage(myList4);
        System.out.println("\nResult 4: " + result4 + "\n"); // Output: [10, 5]
    }
}
