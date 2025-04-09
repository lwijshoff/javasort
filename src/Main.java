import sort.Sort;
import sort.SortConfig;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static int[] generateLargeArray(int size, int bound) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(bound); // values from 0 (inclusive) to bound (exclusive)
        }
        return arr;
    }

    public static void main(String[] args) {
        SortConfig.debug = true; // Enable debug mode (optional)

        // int[] original = {5, 2, 9, 1, 5, 6, 10, 9, 1, 0, -2, 100, 200, 300};

        // Generate a large test array
        int[] original = generateLargeArray(100000, 1000000);

        int[] insertsorted = Sort.straightInsertion(original);
        int[] bubblesorted = Sort.bubbleSort(original);
        int[] mergesorted = Sort.mergeSort(original);
        int[] quicksorted = Sort.quickSort(original);

        System.out.println(" ");
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println(" ");
        // System.out.println("InsertSorted:   " + Arrays.toString(insertsorted));
        // System.out.println("BubbleSorted: " + Arrays.toString(bubblesorted));
        // System.out.println("MergeSorted: " + Arrays.toString(mergesorted));
        // System.out.println("QuickSorted: " + Arrays.toString(quicksorted));
    }
}