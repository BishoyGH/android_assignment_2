/**
 * Modify the above function to be CountGeneral that takes array as
 * parameter and count occurrences of every number in the array and print it
 * Ex. Input [1,2,3,1,3,6] output
 *      1 -> 2
 *      2 -> 1
 *      3 -> 3
 *      6 -> 1
 */
public class Q7 {
    public static void main(String[] args) {
        int[] exampleArray = {1,2,3,1,3,6};
        countGeneral(exampleArray);
    }

    public static void countGeneral(int[] array) {
        // we create empty array that equal array length and each item will hold number and occurrences
        int[][] occurrencesArray = new int[array.length][2];

        for (int num : array) {
            // check if item is printed before and break when true
            if(isIndexed(num, occurrencesArray)) continue;

            // find occurrences
            int occurrences = countOccurrences(num, array);

            // update occurrences array
            updateOccurrencesArray(occurrencesArray, num, occurrences);

            // print result
            System.out.println(num + "->" + occurrences);
        }
    }

    private static int countOccurrences(int targetNum , int[] array) {
        int count = 0;

        for (int num : array) {
            if (num == targetNum) {
                count++;
            }
        }
        return count;
    }

    private static boolean isIndexed(int targetNum, int[][] array){
        for (int[] item : array){
            if(item[1] == 0) return false; // when we reach empty item
            if(item[0] == targetNum && item[1] > 0) return true; // if we reach the item
        }
        return false;
    }

    private static void updateOccurrencesArray(int[][] array, int number, int occurrences){
        for (int[] item : array){
            if(item[1] == 0){
                item[0] = number;
                item[1] = occurrences;
                break;
            }
        }
    }
}
