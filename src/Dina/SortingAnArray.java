package Dina;

import java.util.Arrays;

public class SortingAnArray {
    public static void main(String[] args) {
        int[] arr = {15, 42, 10, 9, 8, 7};
        System.out.println("sort(arr) ==> " + Arrays.toString(selectionSort(arr)));
        System.out.println("Using Built in (sort1(arr)) ==> " + Arrays.toString(builtInSort(arr)));
        System.out.println("BubbleSort(arr)) ==> " + Arrays.toString(bubbleSort(arr)));
    }

    public static int[] builtInSort(int[] array) {
       Arrays.sort(array);
       return array;
    }

    public static int[] selectionSort(int[] array){
        // I used selection sort that compare i = 0 with all the other member in the array :)
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static int[] bubbleSort(int[] array) {
        // I used bubble sort in this method
        for (int i = 0; i < array.length - 1; i++) { // i=index 0 to 5 which last index
            for (int j = 0; j < array.length - 1 - i; j++) { // j = index 0 to 4
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }
        }
        return array;
    }
}

/*
write a return method that can sort an int array in Ascending order
without using the sort method of the Arrays class
ex: int[] arr = {10, 9, 8, 7};
arr = sort(arr); ==>{7, 8, 9, 10};
 */