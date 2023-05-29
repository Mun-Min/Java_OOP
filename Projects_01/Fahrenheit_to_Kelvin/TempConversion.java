// import libraries 
import java.util.Scanner;

public class TempConversion { 
   public static void main(String[] args) {
    // Below this comment: declare and instantiate a Scanner
    Scanner scanner = new Scanner(System.in); 
      
    // Below this comment: declare any other variables you may need
    // to store the user's input and the Kelvin equivalent value
    double fahrenheit; 
    double kelvin;  

    // Below this comment: collect the required inputs from the user
    System.out.println("Enter a temperature in Fahrenheit"); 
    fahrenheit = scanner.nextDouble(); 

    // Below this comment: call your FahrenheitToKelvin method
    kelvin = FahrenheitToKelvin(fahrenheit); 

    // Below this comment: display the required results
   System.out.printf("\n%.2f degrees Fahrenheit is %.2f Kelvin%n", fahrenheit, kelvin);
    
    // Close the Scanner object 
    scanner.close(); 
   }
   
   // define your FahrenheitToKelvin method here below
   public static double FahrenheitToKelvin(double fahrenheit) { 
      return (((fahrenheit - 32) * 5/9) + 273.15);
   } 
   
}