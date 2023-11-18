/**
 * Write a function CalculateEven that takes array as parameter and calculate
 * the sum of even numbers and how many even numbers
 */
public class Q5 {
    public static void main(String[] args) {
        int[] exampleArray = {1,2,3,4,5};
        calculateEven(exampleArray);
    }

    private static void calculateEven(int[] array) {
        int sumOfEven = 0;
        int countOfEven = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                sumOfEven += num;
                countOfEven++;
            }
        }

        System.out.println("Sum of even numbers: " + sumOfEven);
        System.out.println("Count of even numbers: " + countOfEven);
    }
}
