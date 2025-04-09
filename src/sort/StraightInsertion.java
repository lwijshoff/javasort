package sort;

public class StraightInsertion {
    public static int[] sort(int[] input) {
        int[] arr = input.clone();  // Keep original array unchanged
        long comparisons = 0;

        for (int j = 1; j < arr.length; j++) {
            int t = arr[j];
            int i = j;

            while (i > 0 && arr[i - 1] > t) {
                comparisons++;
                arr[i] = arr[i - 1];
                i--;
            }

            if (i > 0) comparisons++;
            arr[i] = t;
        }

        if (SortConfig.debug) {
            System.out.println("Straight Insertion Sort comparisons: " + comparisons);
        }

        return arr;
    }
}