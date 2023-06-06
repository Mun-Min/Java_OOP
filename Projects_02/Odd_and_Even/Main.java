public class Main { 
    public static void main (String [] args) { 
       int [] myArray = {1, 2, 3, 4, 5}; // given array 
       int [] result = oddAndEven(myArray); // call oddAndEven method and assign myArray
       System.out.println("\nOdd and Even value of Array {1, 2, 3, 4, 5}: "); 
       System.out.println("\n{" + result[0] + ", " + result[1] + "}\n");  // display results  
    }
    
    /**
    oddAndEven --> method that displays the odd and even in a given array of integers
    @params --> int [] arr (given array of integers) 
    */
    public static int [] oddAndEven(int [] arr) { 
       // initialize counter variables 
       int oddCount = 0; 
       int evenCount = 0; 
       
       for (int num : arr) { // loop through given array and assign numbers in arr to variable num 
          if (num % 2 == 0) { // if true, num is even 
             evenCount++;   // increment even counter
          }
          else { // otherwise, num is odd
             oddCount++; // increment odd counter
          }  
       }
       return new int[]{oddCount, evenCount}; // return a new array of integers (oddCount, evenCount)
    }
 }