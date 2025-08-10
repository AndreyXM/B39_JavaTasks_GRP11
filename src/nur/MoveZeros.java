package nur;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,3,0,4,0};
        moveZeros(arr);
        moveZeros2(arr);
    }
    public static void moveZeros(int[]arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                count++;
            }
        }
        //System.out.println("count = " + count); ->how many zeros do we have?
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));
        list.removeIf(x->x==0);
        //System.out.println(list); ->zero free ArrayList
        for (int i = 0; i < count; i++) {
            list.add(0); //add zeros to the end
        }
        System.out.println(list);
    }
    public static void moveZeros2(int[]arr1){
        int[]arr2 = new int[arr1.length];
        int index=0;
        for (int each : arr1) {
            if(each!=0){
                arr2[index++]=each;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
