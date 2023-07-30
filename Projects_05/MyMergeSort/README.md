# MySorts Java Class - Merge Sort Implementation

## Required Skills Inventory
To complete this task, you should be familiar with the following concepts and skills:
- Implementing merge sort algorithm

- Understanding recursion
- Working with `IList<Integer>` objects
- Implementing helper methods for merge sort

## Problem Description and Given Info
You are required to create a public class named `MySorts` in Java, with methods as defined below. Your merge sort algorithm should operate on `IList<Integer>` objects, as defined in the given `IList.java` and `MyArrayList.java` files.

### Structure of the MySorts Fields
Your merge sort algorithm should require no static or instance fields in your `MySorts` class.

### Structure of the MySorts merge sort Methods
Your `MySorts` class must implement the following methods:
```java
public static void mergesort(IList<Integer> list);
private static IList<Integer> mergesortHelper(IList<Integer> list);
private static IList<Integer> getLeftHalf(IList<Integer> list);
private static IList<Integer> getRightHalf(IList<Integer> list);
private static IList<Integer> merge(IList<Integer> left, IList<Integer> right);
```

### Additional Information
- The `mergesort` method will take a reference to an `IList<Integer>` object as its only argument. This method will call the `mergesortHelper` method to do the actual work of sorting the list. By the time this method returns, the values in the `IList` should be sorted.

- The `mergesortHelper` method is a recursive method that will implement the actual merge sort algorithm. The argument is a reference to the list of values that is to be sorted. This method will call the `getLeftHalf` and `getRightHalf` methods to divide a larger list and call the `merge` method to merge two sorted sub-lists into one sorted list.
- The `getLeftHalf` method will take as its argument a reference to the list of values that is to be sorted. This method will return an `IList<Integer>` that contains the first half of the list that was passed to it as an argument. For lists with an odd number of values, the `getLeftHalf` method should return the smaller half of the list.
- The `getRightHalf` method will take as its argument a reference to the list of values that is to be sorted. This method will return an `IList<Integer>` that contains the second half of the list that was passed to it as an argument. For lists with an odd number of values, the `getRightHalf` method should return the larger half of the list.
- The `merge` method will take two sorted lists as arguments. This method must create a new `IList<Integer>` and merge the two argument lists into one sorted list that will be returned.

## Getting Started
1. Create a new Java file named `MySorts.java`.

2. Define the `MySorts` class and implement the required methods (`mergesort`, `mergesortHelper`, `getLeftHalf`, `getRightHalf`, and `merge`).

3. Test your `MySorts` class by using the provided `Main.java` class or by creating additional test cases.

## Notes
- Handle edge cases appropriately, such as checking if the list is null or empty before applying merge sort.

- Comment your code adequately, explaining your thought process and any assumptions you make during implementation.

## Solution 

To see the code solution, please check the following file:

* [Main.java](/Projects_05/MyMergeSort/Main.java)

* [IList.java](/Projects_05/MyMergeSort/IList.java)
* [MyArrayList.java](/Projects_05/MyMergeSort/MyArrayList.java)
* [MySorts.java](/Projects_05/MyMergeSort/MySorts.java)

---