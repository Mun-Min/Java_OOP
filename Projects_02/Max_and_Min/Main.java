public class Main {
    public static void main(String [] args) { 
       int [] myArray = {1, 2, 3, 4, 5}; // given array
       int [] result = maxAndMin(myArray); // call maxAndMin method and pass in given array
       System.out.println("\nMax and Min value of Array {1, 2, 3, 4, 5}: "); 
       System.out.println("\n{" + result[0] + ", " + result[1] + "}\n"); 
    }
    
    /**
    maxAndMin method --> displays the maximum and minimum value in a given array
    @params --> int [] array (the given array of integers) 
    */
    public static int [] maxAndMin(int [] array) { 
     int max = Integer.MIN_VALUE; 
     int min = Integer.MAX_VALUE; 
     
     for (int num : array) { // loop through array and assign numbers to num variable
       if (num > max) { // if num in array is greater than the max value, assign num value to max variable
          max = num;  
       }
       if (num < min) { // if num in array is less than the min value, assign num value to min variable
          min = num;   
       }
     }
     return new int[]{max, min}; // return new array of integers (maximum and minimum values) 
    }
 }
 