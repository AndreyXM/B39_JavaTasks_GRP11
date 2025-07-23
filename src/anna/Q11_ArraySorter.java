package anna;

import java.util.Arrays;

//Write a return method that sorts an int[] in ascending order, without using Arrays.sort().
public class Q11_ArraySorter {
    public static void main(String[] args) {
        int[] nums = {5, 3, 8, 1, 2};
        int[] sorted = arraySorter(nums);
        System.out.println(Arrays.toString(sorted));
    }

    public static int[] arraySorter(int[] ints) {
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = 0; j < ints.length - 1 - i; j++) {
                if (ints[j] > ints[j + 1]) {
                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
        }
        return ints;
    }
}
