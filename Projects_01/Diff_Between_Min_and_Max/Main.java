public class Main {
    public static void main(String[] agrs) {
       // you may write code in this main method to test your required method
       System.out.println(); 
       System.out.println(DiffMinMax(1, 2, 3)); 
       System.out.println(DiffMinMax(50, 10, 20)); 
       System.out.println(DiffMinMax(1, 1, 1));
       System.out.println(DiffMinMax(50, 100, 10));
    }
    
    // define your required method here below
    public static int DiffMinMax(int num1, int num2, int num3) { 
       int max = num1; 
       int min = num1; 
       
       if(num2 < min) { // if num2 is less than the minimum value, assign minimum value to num2
          min = num2;   
       }
       else if(num2 > max) { // if num2 is greater than the maximum value, assign maximum value to num2
          max = num2;
       }
       if(num3 < min) { // if num3 is less than the minimum value, assign minimum value to num3
          min = num3;   
       }
       else if(num3 > max) { // if num3 is greater than the maximum value, assign maximum value to num3
          max = num3;
       }
       
       return max - min; // return the difference
    } 
 }
 