package Dina;

public class FindMinNum {
    public static void main(String[] args) {
        int[] arr = {2, 0, 4, 7, 1, 8};
        System.out.println(findMinNum(arr));

    }

    public static Integer findMinNum(int[] array) {
        int minNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNum) {
                minNum = array[i];
            }
        }
        return minNum;

    }
}
/*
Write a method that can find the minimum number from an int Array
 */