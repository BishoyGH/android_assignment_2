/**
 * Write a function count2 that takes array as parameter and counts
 * occurrences of number 2
 */
public class Q6 {
    public static void main(String[] args) {
        int[] exampleArray = {1,2,2,3,2,4,2,2,2,122};
        int occurrencesOf2 = countOccurrences(2, exampleArray);

        System.out.println("Occurrences of 2: " + occurrencesOf2);


        // Extra
        int occurrencesOfDigit2 = countDigit(2, exampleArray);
        System.out.println("Occurrences of digit 2: " + occurrencesOfDigit2);
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


    /**
     * Extra: Count Digit 2
     */
    private static int countDigit(int targetNum, int[] array) {
        int count = 0;

        for (int num : array) {
            count += countDigitInNumber(targetNum, num);
        }

        return count;
    }

    private static int countDigitInNumber(int targetNum, int number) {
        int digitCount = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit == targetNum) {
                digitCount++;
            }
            number /= 10;
        }

        return digitCount;
    }
}
