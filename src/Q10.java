/**
 * compare between binary search and linear search in terms of performance
 * and best case and worst case and average case.
 */
public class Q10 {
    /**
     * Binary Search:
     * ---------------------------
     * Performance: O(log n)    -> because we always skip unneeded half of array
     * Best Case: O(1)          -> element is in the middle of array
     * Worst Case: O(log n)     -> element at beginning or end
     * Average Case: O(log n)   -> element is not in beginning or end or middle of array
     * ===========================
     * Linear Search:
     * ---------------------------
     * Performance: O(n)        -> n is number of element in array
     * Best Case:  O(1)         -> element is the first element of array
     * Worst Case: O(n)         -> element is the last element of array
     * Average Case:  O(n)      -> we check half of array
     */
}
