package Mustafa;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {
        int[] input1 = {1, 0, 2, 0, 3, 0, 4, 0};
        System.out.println (Arrays.toString (moveZeros (input1)));

        int[] input2 = {55, 0, 0, 45, 22, 54, 5, 0, 1, 43};
        System.out.println (Arrays.toString (moveZeros (input2)));
    }

    public static int[] moveZeros(int[] array) {
        int[] movedNums = new int[array.length];

        for (int i = 0, y = 0; i < array.length; i++) {
            if (array[i] != 0) {
                movedNums[y++] = array[i];
            }
        }
        return movedNums;
    }
}
/*
Write a method that can move all the zeros to last indexes of the array (dont use Sort method)
Ex:
    input   : {1,0,2,0,3,0,4,0}
    output  : {1,2,3,4,0,0,0,0}
 */