// Below this comment: import the Scanner
import java.util.Scanner;

public class Box {
   public static void main(String[] args) {
      // Below this comment: declare and instantiate a Scanner
      Scanner scanner = new Scanner(System.in);
      
      // Below this comment: declare any other variables you may need
      // Below this comment: collect the required inputs
      
      System.out.print("Enter width    : ");
      int width = scanner.nextInt();
      
      System.out.print("Enter height   : ");
      int height = scanner.nextInt();
      
      System.out.print("Enter border   : ");
      char border = scanner.next().charAt(0);
      
      System.out.print("Enter interior : ");
      char interior = scanner.next().charAt(0);
      
      System.out.println();

      // Below this comment: display the required results
      for (int i = 0; i < height; i++) { 
         for (int j = 0; j < width; j++) { 
            if (i == 0 || i == height - 1 || j == 0 || j == width - 1) { 
               // Print border character for the top, bottom, left, and right edges
               System.out.print(border);   
            }
            else { 
               // Print interior character for the inner area
               System.out.print(interior); 
            }
         }
         // Move to the next line after each row is printed
         System.out.println();
      }
   }
}
