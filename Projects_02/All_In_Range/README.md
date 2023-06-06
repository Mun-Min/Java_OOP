# Program Name: Range Filter

This program demonstrates the usage of the `inRange` method. The `inRange` method returns an ArrayList containing all the elements in the argument ArrayList that are between the second argument value and the third argument value (inclusive).

### Required Skills Inventory

- Define and declare variables

- Create and use ArrayLists
- Write loops to iterate through an ArrayList
- Use conditional statements to check for element inclusion in a range
- Understand the `main` method and its role in Java programs
- Understand how to compile and run Java programs

### Problem Description and Given Info

The program consists of the following:

- The `inRange` method, which takes an ArrayList of integers, `myList`, and two integers, `min` and `max`, as input. It returns an ArrayList, `result`, that contains all the elements in `myList` that fall within the specified range, including the minimum and maximum values.

- The `main` method, which demonstrates the usage of the `inRange` method. It creates a new ArrayList, `myList`, and populates it with some values. It then calls the `inRange` method with different ranges and prints the results on the console.

### Example Output

```
Given: ArrayList with these values {1, 2, 3, 4, 5}:
inRange(myList, 2, 4) should return an ArrayList with these values [2, 3, 4]

Given: ArrayList with these values {3, 7, 6, 2, 9, 0, 4, 8}:
inRange(myList, 3, 10) should return an ArrayList with these values [3, 7, 6, 9, 4, 8]

Given: ArrayList with these values {1, 1, 1}:
inRange(myList, 1, 1) should return an ArrayList with these values 1, 1, 1]
```

### Helpful Info

* The `inRange` method iterates through each element in the input ArrayList, `myList`, and checks if the current element is within the specified range. If an element is within the range, it is added to the `result` ArrayList.

* The `main` method demonstrates the usage of the `inRange` method by creating a new ArrayList, populating it with values, calling `inRange` with different ranges, and printing the results.

* Zero is considered to be within the range.

### Solution

To see the code solution, please check the following file:

* [Main.java](/Projects_02/All_In_Range/Main.java)

---