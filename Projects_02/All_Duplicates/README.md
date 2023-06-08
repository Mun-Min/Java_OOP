# Duplicate Elements Finder

This program finds all the duplicate elements in an ArrayList of integers.

### Required Skills Inventory

- Define and declare variables

- Create and use ArrayLists
- Use HashSet to store unique elements
- Write loops to iterate over elements in a list
- Use conditional statements to check for duplicate elements
- Understand the `main` method and its role in Java programs
- Understand how to compile and run Java programs

### Problem Description and Given Info

The program consists of the following:

- The `main` method, which creates an ArrayList `myList` and adds some elements to it. It then calls the `allDuplicates` method, passing `myList` as an argument. The result is then displayed on the console.

- The `allDuplicates` method, which takes an ArrayList of integers as input and returns an ArrayList containing all the elements that appear more than once in the input list.

### Example Output

```
Example 1

Given: ArrayList with these values {1, 2, 3, 4, 5};

allDuplicates(myList) should return an ArrayList with these values { }

Example 2

Given: ArrayList with these values {3, 2, 3, 1, 4, 2, 1, 3, 0};

allDuplicates(myList) should return an ArrayList with these values {3, 2, 1}

Example 3

Given: ArrayList with these values {1, 1, 1};

allDuplicates(myList) should return an ArrayList with these values {1}
```

### Helpful Info

* You may want to write a `main` method to call and test your required method.

* The `HashSet` data structure is used to store unique elements. It allows constant-time performance for basic operations such as add, remove, and contains.

* The `contains` method of ArrayList is used to check if an element is already added to the duplicates list.

### Solution

To see the code solution, please check the following file:

* [Main.java](/Projects_02/All_Duplicates/Main.java)

---