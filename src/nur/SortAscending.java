package nur;

import java.util.Arrays;

public class SortAscending {
    public static void main(String[] args) {
        int[]arr = {10,9,8,7};
        sortAscending(arr);
    }
    public static void sortAscending(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
