# Pen Attributes

Create a program that simulates a physical pen and displays its attributes to the console utilizing Object-Oriented Programming (OOP) methodology.

### Required Skills Inventory

* Define and declare classes

* Create and use objects of a class
* Write methods according to given specifications
* Write methods that take arguments and return values
* Use variables to name, store, and retrieve values
* Use parameter variables in a method body
* Write a return statement
* Use the `System.out.println()` method to print output to the console
* Utilize object-oriented programming (OOP) methodology
* Understand the concept of classes and objects
* Understand the `main` method and its role in Java programs
* Understand how to compile and run Java programs

### Problem Description and Given Info

* Create a class named `Pen` with the following attributes:
    - A `color` variable that holds the color of the pen
    - A `type` variable that holds the ball-point type of the pen in millimeters
    - An `is_Clicked` variable that holds a boolean value representing whether the pen is clicked or not

* Implement the following methods in the `Pen` class:
    - `get_pen_Color()`: Returns the color of the pen
    - `get_pen_Type()`: Returns the ball-point type of the pen in millimeters
    - `set_pen_Color()`: Re-assigns the color of the pen to a new color
    - `set_pen_Type()`: Re-assigns the ball-point type of the pen to a new ball-pointtype
    - `Click()`: Simulates clicking the pen and returns `true` to indicate that it can write
    - `un_Click()`: Simulates unclicking the pen and returns `false` to indicate that it cannot write
    
* In the `main` method of the `Main` class, create an instance of the `Pen` class and call the methods to display the pen's attributes to the console.

### Example Output

    $ java Main

    Color of the Pen: Black

    New Color of the Pen: Blue

    Ball-Point type of the Pen (in mm): 10

    New Ball-Point type of the Pen (in mm): 5

    The pen is able to write now that it is clicked: true

    The pen is able to write now that it is clicked: false


### Helpful Info

* You will need to create two separate files, one file that will have your `Pen` class and its methods and one file that will call those methods and display the results.

### Solution

* [Main.java](/Projects_01/Pen/Main.java)
* [Pen.java](/Projects_01/Pen/Pen.java)

---
