public class Main { 
 
    public static void main (String [] args) { 
      int [] myArray = {1, 2, 3, 4, 5}; // given array
      double [] result = avgAndSum(myArray); // call avgAndSum method and pass in the given array
      
      // display results
      System.out.println("\nAverage and Sum value of Array {1, 2, 3, 4, 5}: "); 
      System.out.println("\n{" + result[0] + ", " + result[1] + "}\n"); 
    }
    
    /**
      avgAndSum method -- calculates the average and the sum of a given array 
      
      @params --> int[] array (an array with numbers that will be used for calculation) 
    */
    public static double[] avgAndSum(int[] array) { 
      double sum = 0; // initializing sum variable
      for (int num : array) { // loop through array and assign numbers in array to num variable
         sum += num;   // add (sum) numbers (num) together 
      }
      
      double average = sum / array.length; // calculate average
      
      return new double[] {average, sum}; // return new array with new numbers (average and sum) 
    }
   }