package sort;

public class BubbleSort {
    public static int[] sort(int[] input) {
        int[] arr = input.clone();  // Keep original array unchanged
        long comparisons = 0;
        boolean swapped;

        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                comparisons++;
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // Optimization: stop if already sorted
        }

        if (SortConfig.debug) {
            System.out.println("Bubble Sort comparisons: " + comparisons);
        }

        return arr;
    }
}
