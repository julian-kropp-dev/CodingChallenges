package AddMinMax;

/**
 * Find the maximum and minimum values in an array and return its sum
 */

public class AddMinMax {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 9, 2, 0};
        System.out.println(addMinMax(array));
    }

    public static int addMinMax (int[] array) {
        int minElement = array[0];
        int maxElement = array[0];

        for (int j : array) {
            if (j > maxElement) {
                maxElement = j;
            }
            if (j < minElement) {
                minElement = j;
            }

        }
        System.out.println(maxElement);
        System.out.println(minElement);
        return (minElement + maxElement);
    }
}
