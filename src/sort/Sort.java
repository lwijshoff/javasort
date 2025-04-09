package sort;

public class Sort {
    public static int[] straightInsertion(int[] arr) {
        return StraightInsertion.sort(arr);
    }

    public static int[] bubbleSort(int[] arr) {
        return BubbleSort.sort(arr);
    }

    public static int[] mergeSort(int[] arr) {
        return MergeSort.sort(arr);
    }

    public static int[] quickSort(int[] arr) {
        return QuickSort.sort(arr);
    }
}