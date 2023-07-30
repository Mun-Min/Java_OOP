# MySorts Java Class

## Required Skills Inventory
To complete this task, you should be familiar with the following concepts and skills:
- Implementing quicksort algorithm

- Understanding recursion
- Working with `IList<Integer>` objects
- Implementing helper methods for quicksort

## Problem Description and Given Info
You are required to create a public class named `MySorts` in Java, with methods as defined below. Your quicksort algorithm should operate on `IList<Integer>` objects, as defined in the given `IList.java` and `MyArrayList.java` files.

### Structure of the MySorts Fields
Your `MySorts` class should have no static or instance fields.

### Structure of the MySorts quicksort Methods
Your `MySorts` class must implement the following methods:
```java
public static void quicksort(IList<Integer> list);
private static void quicksortHelper(IList<Integer> list, int low, int high);
private static int partition(IList<Integer> list, int low, int high);
private static void swap(IList<Integer> list, int i, int j);
```

### Additional Information
- The `quicksort` method will take a reference to an `IList<Integer>` object as its only argument. This method will call the `quicksortHelper` method to do the actual work of sorting the list. By the time this method returns, the values in the `IList` should be sorted.

- The `quicksortHelper` method is a recursive method that will implement the actual quicksort algorithm. The first argument is a reference to the list of values that is to be sorted. The second and third `int` arguments are the index values representing the current partition of the list to be sorted. For example, given an `IList` (named `list`) of 20 values, `quicksortHelper(list, 5, 15)` would quicksort the partition of the list starting at index 5 and ending at index 15.
- The `partition` method will take as its first argument a reference to the list of values that is to be partitioned. The second and third `int` arguments are the index values representing the current section of the list to be partitioned. This method must return the index at which the pivot value was finally placed at the end of this partition operation.
- For this assignment, you should always use the last `int` argument value as the initial pivot index for the partition operation. For example, given an `IList` (named `list`) of 20 values, `partition(list, 5, 15)` would use the high index value 15 as the index of the pivot value for this partition operation.
- The `swap` method will take as its first argument a reference to an `IList` object. The second and third `int` arguments are the indexes of the two items in the list to have their locations swapped.

## Getting Started
1. Create a new Java file named `MySorts.java`.

2. Define the `MySorts` class and implement the required methods (`quicksort`, `quicksortHelper`, `partition`, and `swap`).

3. Test your `MySorts` class by using the provided `Main.java` class or by creating additional test cases.

## Notes
- Handle edge cases appropriately, such as checking if the list is null or empty before applying quicksort.

- Comment your code adequately, explaining your thought process and any assumptions you make during implementation.

## Solution 

To see the code solution, please check the following file:

* [Main.java](/Projects_05/MyQuickSort/Main.java)

* [IList.java](/Projects_05/MyQuickSort/IList.java)
* [MyArrayList.java](/Projects_05/MyQuickSort/MyArrayList.java)
* [MySorts.java](/Projects_05/MyQuickSort/MySorts.java)

---