# Javasort

**Javasort** or **sort** is a comprehensive package offering a collection of popular sorting algorithms implemented in Java. It allows you to easily sort integer arrays using different algorithms, each with varying time complexities and performance characteristics.

---

## Features

- **Multiple Sorting Algorithms**: Includes various algorithms such as **Bubble Sort**, **Merge Sort**, **Quick Sort**, and **Straight Insertion Sort**.
- **Debug Mode**: Easily enable a global debug mode to print out comparison counts and other internal details of the sorting process.
- **Immutable Input**: All sorting methods return a **new sorted array**, keeping the original array unchanged.

---

## Supported Sorting Algorithms

- **Bubble Sort**  
  A simple comparison-based sorting algorithm with average time complexity of O(n²).

- **Merge Sort**  
  A divide-and-conquer algorithm with O(n log n) time complexity, known for its stable sorting.

- **Quick Sort**  
  One of the fastest general-purpose sorting algorithms with average time complexity of O(n log n). However, it can degrade to O(n²) in the worst case if pivoting is not optimized.

- **Straight Insertion Sort**  
  A simple sorting algorithm with O(n²) time complexity, effective for small datasets or nearly sorted arrays.

---

## Installation

To use **Javasort** in your Java project, simply add the `sort` package to your project folder. If you're using an IDE like IntelliJ or Eclipse, you can directly import the classes into your project.

```java
import sort.Sort;
import sort.SortConfig;
```

---

## Example Usage

```java
import sort.Sort;
import sort.SortConfig;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SortConfig.debug = true; // Enable debug mode for internal logs

        int[] array = {5, 2, 9, 1, 5, 6};

        // Using Quick Sort
        int[] sortedArray = Sort.quickSort(array);

        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }
}
```

---

## Configuration

### Debug Mode
You can enable or disable debug output globally for all sorting algorithms via the `SortConfig.debug` flag.

```java
SortConfig.debug = true; // Enable debug mode
SortConfig.debug = false; // Disable debug mode
```

---

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## Contributing

Feel free to fork the repository and submit pull requests. Contributions are welcome to add new sorting algorithms, optimize existing ones, or improve documentation.

---

## Author

This project was created by Leonard Wijshoff and Pavlo Lange
