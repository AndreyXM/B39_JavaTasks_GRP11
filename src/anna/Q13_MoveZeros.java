package anna;

import java.util.Arrays;

/*
Write a method that can move all the zeros to last indexes of the array
(Do Not Use Sort Method)
Ex:
input: [1, 0, 2, 0, 3, 0, 4, 0]
output:[1, 2, 3, 4, 0, 0, 0, 0]
 */
public class Q13_MoveZeros {

    public static void main(String[] args) {
        int[] array = {1, 0, 2, 0, 3, 0, 4, 0};
        int[] newArray = moveZerosToEnd(array);
        System.out.println(Arrays.toString(newArray));
    }
    public static int[] moveZerosToEnd(int[] ints) {
        int nonZeroIndex = 0;
        int[] resultArray = new int[ints.length];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] != 0) {
                resultArray[nonZeroIndex++] = ints[i];

            }
        }
        return resultArray;
    }
}
