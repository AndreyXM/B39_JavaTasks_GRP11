package Mustafa;

public class MinimumNumberArray {

    public static void main(String[] args) {

        System.out.println ("Minimum number in Array is = " + minimumNumberArray (new int[]{15, 12, 13, 45, 50, 9}));
        System.out.println ("Minimum number in Array is = " + minimumNumberArray (new int[]{1, 8, 13, 22, 0, 33}));
        System.out.println ("Minimum number in Array is = " + minimumNumberArray (new int[]{15, 55, -2, 1, 88, 3, 9}));
        System.out.println ("Minimum number in Array is = " + minimumNumberArray (new int[]{}));

    }

    public static int minimumNumberArray(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException ("Array cannot be null or empty.");
        }
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            return min;
        }
    }