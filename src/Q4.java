/**
 * Write a function getMin that takes array as parameter and returns the min
 * value in the array
 */
public class Q4 {
    public static void main(String[] args) {
        int[] exampleArray = {1,2,3,4,5,6};

        try {
            int minValue = getMin(exampleArray);
            System.out.println("Minimum value: " + minValue);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    private static int getMin(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int min = array[0];

        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }

        return min;
    }

}
