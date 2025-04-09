package sort;

public class MergeSort {
    private static long comparisons = 0;

    public static int[] sort(int[] input) {
        comparisons = 0;
        int[] arr = input.clone();
        arr = mergeSort(arr);

        if (SortConfig.debug) {
            System.out.println("Merge Sort comparisons: " + comparisons);
        }

        return arr;
    }

    private static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int li = 0, ri = 0, riOut = 0;

        while (li < left.length && ri < right.length) {
            comparisons++;
            if (left[li] <= right[ri]) {
                result[riOut++] = left[li++];
            } else {
                result[riOut++] = right[ri++];
            }
        }

        while (li < left.length) {
            result[riOut++] = left[li++];
        }
        while (ri < right.length) {
            result[riOut++] = right[ri++];
        }

        return result;
    }
}