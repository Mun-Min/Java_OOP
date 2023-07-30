// MySorts class contains the quicksort algorithm implementation.
public class MySorts {
    // Public method to initiate the quicksort process on the given IList.
    public static void quicksort(IList<Integer> list) {
        quicksortHelper(list, 0, list.size() - 1);
    }

    // Private helper method to perform the quicksort recursively on the sublist defined by low and high indices.
    private static void quicksortHelper(IList<Integer> list, int low, int high) {
        // Base case: If low is less than high, there's at least one element to sort.
        if (low < high) {
            // Partition the list and get the index of the pivot element.
            int pivotIndex = partition(list, low, high);

            // Recursively sort the elements before and after the pivot.
            quicksortHelper(list, low, pivotIndex - 1);
            quicksortHelper(list, pivotIndex + 1, high);
        }
    }

    // Private helper method to partition the list and return the index of the pivot element.
    private static int partition(IList<Integer> list, int low, int high) {
        // Choose the pivot element (in this case, the last element of the sublist).
        int pivot = list.get(high);
        int i = low - 1;

        // Rearrange the elements such that all elements less than the pivot are on the left side,
        // and all elements greater than or equal to the pivot are on the right side.
        for (int j = low; j < high; j++) {
            if (list.get(j) < pivot) {
                i++;
                // Swap the elements at indices i and j.
                swap(list, i, j);
            }
        }

        // Swap the pivot element to its correct position.
        swap(list, i + 1, high);

        // Return the index of the pivot element.
        return i + 1;
    }

    // Private helper method to swap two elements in the list given their indices.
    private static void swap(IList<Integer> list, int i, int j) {
        Integer temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}