package sort;

public class QuickSort {
    private static long comparisons = 0;

    public static int[] sort(int[] input) {
        comparisons = 0;
        int[] arr = input.clone();
        quickSort(arr, 0, arr.length - 1);

        if (SortConfig.debug) {
            System.out.println("Quick Sort comparisons: " + comparisons);
        }

        return arr;
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Pivot: last element
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            comparisons++;
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        if (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}