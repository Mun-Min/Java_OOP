# Meters to Feet and Inches 

### Required Skills Inventory

* Use variables to name, store, and retrieve values
* Use System.out.print to prompt the user for input
* Use a Scanner to collect user input
* Use math operators to construct expressions
* Output to console with System.out.println
* Use String.format to construct a formatted String value
* Use format specifiers to format floating point values
* Use format specifiers to format integer values
* Use escape sequences to include special characters in a String
* Cast values from one data type to another
* Write a method according to given specifications
* Write a method that takes arguments and returns a value
* Write a method that calls another method
* Use parameter variables in a method body
* Write a return statement
* Use math operators to construct an expression

### Problem Description and Given Info

* Write a public static method named MetersToFeetAndInches that will take a single argument of type double and will return a String. 
* When called, and passed a distance value (in Meters), this method must compute and return a String value with the equivalent distance in Feet and Inches.

Here are some examples showing what the value returned by your MetersToFeetAndInches method should be for different argument values:

    MetersToFeetAndInches(10.25f) should return the String value 33' 7.54"
    
    MetersToFeetAndInches(100) should return the String value 328' 1.00"
    
    MetersToFeetAndInches(0) should return the String value 0' 0.00"

You must also write a small program in the main method that will:

* Prompt the user to enter a distance in Meters
* Collect and store the user's input in a double variable
* Call the MetersToFeetAndInches method, passing the user's input as an argument
* Store the value returned by the MetersToFeetAndInches method in another String variable
* Display the Feet and Inches equivalent value 

### Example Output

    Example 1:

    Enter distance in Meters : 10.25

    10.25 meters in Feet and Inches is : 33' 7.54"
    
    Example 2:

    Enter distance in Meters : 100

    100.00 meters in Feet and Inches is : 328' 1.00"
    
    For the given inputs, make sure that your program output looks exactly like the example above (including spelling, capitalization, punctuation, spaces, and decimal points).

### Hints and Helpful Info

* A Meter is 39.37 Inches (use this value for your computations)
* A Foot is 12 Inches
* A single quote mark is a common notation for a value specified in Feet. For example 3 Feet is often expressed as 3'
* A double quote mark is a common notation for a value specified in Inches. For example 7.5 Inches is often expressed as 7.5"
* You may need to cast or convert some values from one data type to another.
* Remember that you can use String.format to construct a String value with a specified number of decimal places.

### Solution 

[Converter.java](https://github.com/Mun-Min/Java_OOP/blob/main/Projects_01/Meters_to_Feet_and_Inches/Converter.java)