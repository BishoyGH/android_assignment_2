/**
 * Write a function getSummation that takes array as parameter and returns
 * summation of its elements
 */
public class Q1 {
    public static void main(String[] args) {
        int[] exampleArray = {2,4,6,8,10};
        int result = getSummation(exampleArray);

        System.out.println("Summation: " + result);
    }

    private static int getSummation(int[] array){
        int sum = 0;

        for (int num : array) { // enhanced for loop
            sum += num;
        }

        return sum;
    }
}
