/**
 * Write function binary search that takes array and sorts it hint -> search about
 * binary search
 */
public class Q8 {
    public static void main(String[] args) {
        int[] exampleArray = {1,8,2,0,3};
        int target = 2;

        int[] sortedArray = selectionSort(exampleArray);
        int result = binarySearch(sortedArray, target);

        if (result != -1) {
            System.out.println("Element " + target + " found in the array ");
        } else {
            System.out.println("Element " + target + " not found in the array");
        }


    }


    private static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid; // Element found
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Element not found
    }


    private static int[] selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        return array;
    }
}
