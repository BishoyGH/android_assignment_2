/**
 * search about selection sort and implement it in function SelectionSort that
 * takes array as a parameter and sort it using the algorithm
 */
public class Q9 {
    public static void main(String[] args) {
        int[] exampleArray = {1,8,2,0,3};

        int[] sortedArray = selectionSort(exampleArray);

        printArray(sortedArray);
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

    private static void printArray(int[] array){
        for (int num : array){
            System.out.print(num + " ");
        }
    }

}
