/**
 * The {@code sort} package provides a collection of sorting algorithms
 * for integer arrays, designed for educational use, performance testing,
 * and general utility.
 * <p>
 * All sorting methods return a new sorted array and leave the original input unchanged.
 * <p>
 * Debug output, such as the number of comparisons made, can be enabled
 * globally using {@link sort.SortConfig#debug}.
 *
 * <h2>Example Usage:</h2>
 * <pre>{@code
 * import sort.Sort;
 * import sort.SortConfig;
 *
 * public class Example {
 *     public static void main(String[] args) {
 *         SortConfig.debug = true;
 *         int[] input = {5, 2, 9, 1};
 *         int[] sorted = Sort.straightInsertion(input);
 *     }
 * }
 * }</pre>
 *
 * @author Leonard Wijshoff
 * @version 1.0
 */
package sort;
