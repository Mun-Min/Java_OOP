public class Main {
    public static void main(String[] args) {
        // Create an array of integers
        int[] myArray = {1, 2, 3, 4, 5};

        // Call the countGreaterThanAverage method and store the result in 'count'
        int count = countGreaterThanAverage(myArray);

        // Print the count of values greater than the average
        System.out.println("\nNumber of Values in the array {1, 2, 3, 4, 5} that are greater than the average of all the values in the array = " + count);  // Output: 2
    }
    
    /**
     * This method computes and returns the number of values in the argument array that are greater than the average of all the values in the argument array.
     * 
     * @param array an array of integers
     * @return the count of values greater than the average
     */
    public static int countGreaterThanAverage(int[] array) {
        // Check if the array is empty
        if (array.length == 0) {
            return 0;  // Return 0 for an empty array
        }

        int sum = 0;
        
        // Calculate the sum of all values in the array
        for (int num : array) {
            sum += num;
        }

        // Calculate the average of the values in the array
        double average = (double) sum / array.length;
        
        int count = 0;
        
        // Count the number of values greater than the average
        for (int num : array) {
            if (num > average) {
                count++;
            }
        }

        // Return the count of values greater than the average
        return count;
    }
}
