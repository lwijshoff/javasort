package sort;

/**
 * The Sort class provides static methods for sorting an array using various sorting algorithms.
 * Each sorting method returns a new sorted array, leaving the original array unchanged.
 */
public class Sort {

    /**
     * Sorts an array using the Straight Insertion Sort algorithm.
     *
     * @param arr The array to be sorted.
     * @return A new array containing the sorted values.
     */
    public static int[] straightInsertion(int[] arr) {
        return StraightInsertion.sort(arr);
    }

    /**
     * Sorts an array using the Bubble Sort algorithm.
     *
     * @param arr The array to be sorted.
     * @return A new array containing the sorted values.
     */
    public static int[] bubbleSort(int[] arr) {
        return BubbleSort.sort(arr);
    }

    /**
     * Sorts an array using the Merge Sort algorithm.
     *
     * @param arr The array to be sorted.
     * @return A new array containing the sorted values.
     */
    public static int[] mergeSort(int[] arr) {
        return MergeSort.sort(arr);
    }

    /**
     * Sorts an array using the Quick Sort algorithm.
     *
     * @param arr The array to be sorted.
     * @return A new array containing the sorted values.
     */
    public static int[] quickSort(int[] arr) {
        return QuickSort.sort(arr);
    }
}