package Mustafa;

import java.util.Arrays;

public class IntegerSum {
    public static void main(String[] args) {

        IntegerSum obj = new IntegerSum ();

        int n1 = 2;
        int[] arr1 = obj.sumZero (n1);
        System.out.println ("N = " + Arrays.toString (arr1));
    }

    public int[] sumZero(int n) {
        if (n <= 1 || n >= 100) {
            throw new IllegalArgumentException ("n must be between 1 and 100");
        }

        int[] result = new int[n];
        int currentNum = 1;
        int index = 0;

        if (n % 2 != 0) {
            result[index++] = 0;
        }
        while (index < n) {
            result[index++] = currentNum;
            result[index++] = -currentNum;
            currentNum++;
        }
        return result;
    }
}
