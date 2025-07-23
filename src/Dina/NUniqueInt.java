package Dina;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NUniqueInt {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("N = " + n + " return " + Arrays.toString(nUniqueIntsSumToZero1(n)));
        System.out.println("N = " + n + " return " + Arrays.toString(nUniqueIntsSumToZero2(n)));
        System.out.println("N = " + n + " return " + nUniqueIntsSumToZero3(n));
        System.out.println("N = " + n + " return " + nUniqueIntsSumToZero4(n));

    }

    public static int[] nUniqueIntsSumToZero1(int n) {
        int[] array = new int[n];
        int index = 0;
        for (int i = 1; i < n / 2; i++) {
            array[index++] = i;
            array[index++] = -i;
        }
        if (n % 2 == 1) {
            array[index] = 0;
        }
        return array;
    }

    public static int[] nUniqueIntsSumToZero2(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i - n/2;
        }
        return array;
    }

    public static List<Integer> nUniqueIntsSumToZero3(int n) {
        List<Integer> list = new ArrayList<Integer>(n);
        for ( int i = 1; i <= n/2; i++ ) { //n/2 create symmetric paris
            list.add(i);
            list.add(-i);
        }
        if (n % 2 == 1) {
            list.add(0);
        }
        Collections.shuffle(list); //I shuffle the list to randomize the order
        return list;
    }

    public static List<Integer> nUniqueIntsSumToZero4(int n) {
        List<Integer> list = new ArrayList<>(n);
        for ( int i = 0; i < n; i++ ) {
            list.add(i - n/2); //sum to zero
        }
        return list;
    }
}
/*
 * Write a function that given an integer n, return a list or array containing n unique
 * integers such that the sum of all the integers is 0.
 * Example:
 * Input: n = 4
 * Output: [1, -1, 2, -2] or any other combination of 4 unique integers that sum to 0
 */
