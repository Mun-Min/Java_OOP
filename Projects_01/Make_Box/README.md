# Make Box

### Required Skills Inventory

* Use variables to name, store, and retrieve values

* Use `System.out.print` to prompt the user for input
* Use a `Scanner` to collect user input
* Use loops to get the computer to repeat instructions
* Use nested loops to construct an algorithm

### Problem Description and Given Info

Write a java program that will collect the following 4 inputs from the user:

* Width of the box

* Height of the box
* Border character
* Interior character
* Your program must collect the inputs in the order described above
* With these inputs, your program must print out a box made of the border and interior characters, and with the specified height and width

### Example Output 

    Example 1

    Enter width    : 7
    Enter height   : 5
    Enter border   : X
    Enter interior : O

    XXXXXXX
    XOOOOOX
    XOOOOOX
    XOOOOOX
    XXXXXXX

    Example 2

    Enter width    : 4
    Enter height   : 3
    Enter border   : +
    Enter interior : *

    ++++
    +**+
    ++++

    Example 3

    Enter width    : 9
    Enter height   : 4
    Enter border   : $
    Enter interior : .

    $$$$$$$$$
    $.......$
    $.......$
    $$$$$$$$$

    For the given inputs, make sure that your program output looks exactly like the example above (including spelling, capitalization, punctuation, spaces, and decimal points).

### Hints and Helpful Info

* It can help to break this process down into steps

* To print the box, you must print a number of lines of text (specifically height lines of text)
* For each line of text that you print, you must print a number of characters (Specifically width characters)
* Each character is either a border character or an interior character
* You can use a loop to iterate through each line of the box
* You can use a nested loop to iterate through each character in this line of the box
* You can use a decision statement to decide to print either a border character or an interior character
* If the current line is the first line, then the printed character will be the border character
* If the current character is the first character on this line, then the printed character will be the border character
* After each line, you can print a newline character to start the next line
* There are other ways to structure your solution. Please feel free to experiment with and explore different possibilities

### Solution 

To see the code solution, please check the following file:

[Box.java](https://github.com/Mun-Min/Java_OOP/blob/main/Projects_01/Make_Box/Box.java)

---
