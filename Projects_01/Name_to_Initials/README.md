# Name to Initials

### Required Skills Inventory

* Use variables to name, store, and retrieve values

* Use `System.out.print` to prompt the user for input
* Use a `Scanner` to collect user input
* Use String methods (like `indexOf` and `substring`) to extract information from a String value
* Write a method according to given specifications
* Write a method that takes arguments and returns a value
* Write a method that calls another method
* Use parameter variables in a method body
* Write a `return` statement
* Use `if` statements to get the computer to make a decision

### Problem Description and Given Info

Write a public static method named `getInitials`:

* `getInitials` will take a single argument of type String and will return a String

* When called, and passed a name, this method must compute and return a String value with the initials for the given name

### Example Output

    getInitials("Bob Allen Smith") should return the String value "B. A. S."
    
    getInitials("Bob Smith") should return the String value "B. S."
    
    getInitials("Bob") should return the String value "B."

    Note that the argument to this method may be a String containing just a first name (i.e. "Bob"), just first name and last name (i.e. "Bob Smith"), or the first name and middle name and last name (i.e. "Bob Allen Smith")

You must also write a small program in the `main` method that will:

* Prompt the user to enter a name

* Collect and store the user's input in a String variable
* Call the `getInitials` method, passing the user's input as an argument
* Store the value returned by the `getInitials` method in another String variable
* Display the name and initials as shown in the examples below

        Example 1

        Enter name : Bob Allen Smith

        Initials for Bob Allen Smith : B. A. S.

        Example 2

        Enter name : Bob Smith

        Initials for Bob Smith : B. S.

        Example 3

        Enter name : Bob

        Initials for Bob : B.

        For the given inputs, make sure that your program output looks exactly like the example above 
        (including spelling, capitalization, punctuation, spaces, and decimal points).

### Hints and Helpful Info

* The `indexOf` method can be very helpful for finding things like space characters in a String

* Java has an overloaded indexOf method with takes an extra int argument indicating where to start a search in a String
* Java also has an `lastIndexOf` method, which searches a String starting at the end
* The `substring` method can be very helpful for extracting one or more characters from a String
* You may need to write some to code to make decisions based on whether the input has one (just first), two (first and last), or three (first, middle, and last) names
* The number of spaces in the input can help you determine how many names are in the input
* It can be helpful to know and understand the difference between the `Scanner` methods `next` and `nextLine`

### Solution 

To see the code solution, please check the following file:

[Initials.java](https://github.com/Mun-Min/Java_OOP/blob/main/Projects_01/Name_to_Initials/Initials.java)

---
