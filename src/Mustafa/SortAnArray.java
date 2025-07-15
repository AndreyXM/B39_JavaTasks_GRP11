package Mustafa;

public class SortAnArray {
    public static void main(String[] args) {
        int arr2[] = {90, 111, 158, 22, 47, 53, 16, 74, 205};

        sortAnArray (arr2);

        for (int i : arr2) {
            System.out.print (i + " ");
        }
    }

    public static void sortAnArray(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
