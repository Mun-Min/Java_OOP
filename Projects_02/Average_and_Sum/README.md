# Average and Sum

Create a program that calculates the average and sum of a given array of numbers.

### Required Skills Inventory

* Declare and initialize arrays

* Write methods with parameters and return values
* Use loop statements to iterate over arrays
* Perform mathematical calculations
* Display output using `System.out.println()`
* Understand the `main` method and its role in Java programs
* Compile and run Java programs

### Problem Description and Given Info

Write a program that calculates the average and sum of a given array of numbers.

* In the `main` method of the `Main` class, declare and initialize an array named `myArray` with the given numbers.

* Call the `avgAndSum` method and pass in the `myArray` array as an argument.
* The `avgAndSum` method should take an `int` array as a parameter and return a `double` array with two elements: the average and the sum of the numbers in the array.
* Inside the `avgAndSum` method, calculate the sum of the numbers in the array by iterating over the array and adding each element to a `sum` variable.
* Calculate the average by dividing the sum by the length of the array.
* Return a new `double` array with the average and sum as elements.
* In the `main` method, display the results by printing the elements of the returned array.

### Example Output

```
Average and Sum of Array {1, 2, 3, 4, 5}: 

{3.0, 15.0}
```

### Helpful Info:

- You may want to write a `main` method to call and test your `avgAndSum` method

- There should be no `System.out.print` or `System.out.println` statements in your `avgAndSum` method
- There should be no calls to any Scanner methods (like `next`, `nextLine`, or `nextInt`) in you `avgAndSum` method

### Solution

* [Main.java](/Projects_02/Average_and_Sum/Main.java)

---

