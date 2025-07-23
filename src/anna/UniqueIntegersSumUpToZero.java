package anna;

import java.util.Arrays;

public class UniqueIntegersSumUpToZero {

    public static void main(String[] args) {
        int[] output = sumToZero(99);
        System.out.println(Arrays.toString(output));

    }

    public static int[] sumToZero(int num) {
        if (num <= 1 || num >= 100) {
            throw new IllegalArgumentException("Number must be greater than 1 and less than 100!");
        }
        int[] result = new int[num];
        int index = 0;

        for (int i = 1; i <= num / 2; i++) {
            result[index++] = i;
            result[index++] = -i;
        }

        if (num % 2 == 1) {
            result[index] = 0;
        }
        return result;
    }
}
