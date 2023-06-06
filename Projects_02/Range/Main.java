public class Main { 
 
    public static void main (String [] args) { 
       int [] myArray = {1, 2, 3, 4, 5}; // given array 
       int result = range(myArray); // call oddAndEven method and assign myArray
       System.out.println("\nDifference between the maximum and minimum values in the argument array {1, 2, 3, 4, 5} = " + result);  // display results  
    }
    
    /**
    range method --> this method will compute and return the positive difference between the minimum of all the values in the argument array, and the maximum of all the values in the argument array
    @params --> int [] array (the given array of integers) 
    */
    public static int range(int [] array) { 
       int min = Integer.MAX_VALUE; 
       int max = Integer.MIN_VALUE; 
       
       for (int num : array) { // loop through array and assign numbers to num variable
          if (num < min) { // if num in array is less than the min value, assign num value to min variable
             min = num; 
          }  
          if (num > max) { // if num in array is greater than the max value, assign num value to max variable
             max = num;   
          }
       }
       return max - min; // return the positive difference between the minimum of all the values in the argument array, and the maximum of all the values in the argument array
    } 
 }