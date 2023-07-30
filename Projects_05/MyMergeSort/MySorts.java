// Contains sorting algorithms
public class MySorts {
    // Sorts the given list using merge sort
    public static void mergesort(IList<Integer> list) {
        if (list.size() > 1) {
            // Split the list into two halves
            IList<Integer> leftHalf = getLeftHalf(list);
            IList<Integer> rightHalf = getRightHalf(list);

            // Recursively sort both halves
            mergesort(leftHalf);
            mergesort(rightHalf);

            // Merge the two sorted halves back into the original list
            IList<Integer> merged = merge(leftHalf, rightHalf);
            for (int i = 0; i < merged.size(); i++) {
                list.set(i, merged.get(i));
            }
        }
    }

    // Helper method for merge sort that recursively splits the list into two halves
    private static IList<Integer> mergesortHelper(IList<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }

        IList<Integer> leftHalf = getLeftHalf(list);
        IList<Integer> rightHalf = getRightHalf(list);

        leftHalf = mergesortHelper(leftHalf);
        rightHalf = mergesortHelper(rightHalf);

        return merge(leftHalf, rightHalf);
    }

    // Helper method that returns the left half of the given list
    private static IList<Integer> getLeftHalf(IList<Integer> list) {
        int size = list.size() / 2;
        IList<Integer> leftHalf = new MyArrayList<>();
        for (int i = 0; i < size; i++) {
            leftHalf.add(list.get(i));
        }
        return leftHalf;
    }

    // Helper method that returns the right half of the given list
    private static IList<Integer> getRightHalf(IList<Integer> list) {
        int size = list.size() - (list.size() / 2);
        IList<Integer> rightHalf = new MyArrayList<>();
        for (int i = 0; i < size; i++) {
            rightHalf.add(list.get(i + list.size() / 2));
        }
        return rightHalf;
    }

    // Helper method to merge two sorted lists into a single sorted list
    private static IList<Integer> merge(IList<Integer> list1, IList<Integer> list2) {
        IList<Integer> merged = new MyArrayList<>();
        int index1 = 0;
        int index2 = 0;

        while (index1 < list1.size() && index2 < list2.size()) {
            if (list1.get(index1).compareTo(list2.get(index2)) <= 0) {
                merged.add(list1.get(index1));
                index1++;
            } else {
                merged.add(list2.get(index2));
                index2++;
            }
        }

        while (index1 < list1.size()) {
            merged.add(list1.get(index1));
            index1++;
        }

        while (index2 < list2.size()) {
            merged.add(list2.get(index2));
            index2++;
        }

        return merged;
    }
}