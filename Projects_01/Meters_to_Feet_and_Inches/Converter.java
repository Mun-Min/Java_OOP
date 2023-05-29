// import libraries
import java.util.Scanner;

public class Converter {
   public static void main(String[] args) {
      // Below this comment: declare and instantiate a Scanner
      Scanner scanner = new Scanner(System.in); 
      
      // Below this comment: declare any other variables you may need
      // to store the user's input and the Feet and Inches equivalent value
      System.out.println("Enter distance in Meters: "); 
      
      // Below this comment: collect the required inputs
      double distanceInMeters = scanner.nextDouble(); 

      // Below this comment: call your MetersToFeetAndInches method
      String result = MetersToFeetAndInches(distanceInMeters); 
      
      // Below this comment: disply the required results
      System.out.println(String.format("\n%.2f", distanceInMeters) + " meters in Feet and Inches is: " + result); 
   }
   
   // define your MetersToFeetAndInches method here below
   public static String MetersToFeetAndInches(double distanceInMeters) { 
      double totalInches = distanceInMeters * 39.37; 
      int feet = (int) (totalInches / 12); 
      double inches = totalInches % 12; 
      
      return feet + "' " + String.format("%.2f", inches) + "\""; 
   }
}
