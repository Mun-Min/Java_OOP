// Below this comment: import the Scanner
import java.util.Scanner;

public class Initials {
   public static void main(String[] args) {
      // Below this comment: declare and instantiate a Scanner
      Scanner scanner = new Scanner(System.in); 
      
      // Below this comment: declare any other variables you may need
      System.out.println("Enter name: "); 
      String name = scanner.nextLine(); 
            
      // Below this comment: collect the required inputs
      // Below this comment: call your required method
      String initials = getInitials(name);
      
      // Below this comment: display the required results
      System.out.println("\nInitials for " + name + " : " + initials); 
      scanner.close(); 
   }
   
   // define your required method here below
   public static String getInitials(String name) { 
      String [] words = name.split(" "); // each word in the name will be seperated when a space (" ") is found and added to the array
      String initials = "";
      
      for (String word : words) { // loop over each element in the words array to extract initials
         // check if the word is not empty, extract first character from word (name)
         if (!word.isEmpty()) { 
            char initial = Character.toUpperCase(word.charAt(0)); 
            initials += initial + ". "; 
         }
      } 
    return initials.trim(); // return the final result and remove any trailing whitespace
   } 
   
}
