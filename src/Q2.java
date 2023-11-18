/**
 * Write a function getNumOfElements that takes array as parameter and
 * returns the number of its elements
 */
public class Q2 {
    public static void main(String[] args) {
        int[] exampleArray = {5,6,7};
        int numOfElements = getNumOfElements(exampleArray);

        System.out.println("Number of elements: " + numOfElements);
    }

    private static int getNumOfElements(int[] array) {
        int count = 0;

        for (int ignored : array) { // enhanced for loop with ignored element
            count++;
        }

        return count;
    }
}
