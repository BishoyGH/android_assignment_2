/**
 * Write a function getMax that takes array as parameter and returns the max
 * value in the array
 */
public class Q3 {
    public static void main(String[] args) {
        int[] exampleArray = {1,2,3,4,5,6};

        try {
            int maxValue = getMax(exampleArray);
            System.out.println("Maximum value: " + maxValue);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static int getMax(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int max = array[0];

        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

}
