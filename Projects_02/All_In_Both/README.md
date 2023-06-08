# Common Elements Finder

This program finds the common elements between two ArrayLists of integers.

### Required Skills Inventory

- Define and declare variables

- Use ArrayList to store and manipulate collections of data
- Write loops to iterate over ArrayList elements
- Use conditional statements to check for common elements
- Understand the `main` method and its role in Java programs
- Understand how to compile and run Java programs

### Problem Description and Given Info

The program consists of the following:

- The `main` method, which creates two ArrayLists (`list1` and `list2`), populates them with integers, and calls the `inBoth` method, passing `list1` and `list2` as arguments. The result is then displayed on the console.

- The `inBoth` method, which takes two ArrayLists of integers as input and returns an ArrayList containing the common elements present in both lists.

### Example Output

```
Example 1

Given:

ArrayList list1 with these values {1, 2, 3, 4, 5}
ArrayList list2 with these values {0, 2, 9, 3}

inBoth(myList) should return an ArrayList with these values {2, 3}

Example 2

Given:

ArrayList list1 with these values {3, 1, 2, 3, 5, 1, 0}
ArrayList list2 with these values {0, 2, 9, 3, 5, 5}

inBoth(myList) should return an ArrayList with these values {3, 2, 5, 0}

Example 3

Given:

ArrayList list1 with these values {1, 2, 3, 4, 5}
ArrayList list2 with these values {6, 7, 8}

inBoth(myList) should return an ArrayList with these values { }
```

### Helpful Info

* You may want to write a `main` method to call and test your `inBoth` method.

* The `contains` method of ArrayList can be used to check if an element is present in the list.

* The `add` method of ArrayList can be used to add elements to the list.

### Solution

To see the code solution, please check the following file:

* [Main.java](/Projects_02/All_In_Both/Main.java)

---