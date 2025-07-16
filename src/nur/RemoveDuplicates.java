package nur;

import java.util.ArrayList;

public class RemoveDuplicates {
    /*
   Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC")  ==> ABC
    */
    public static void main(String[] args) {
        String str = "AAABBBCCC";
        removeDuplicates(str);

    }
    public static void removeDuplicates(String str){
        String[]letters = str.split("");
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < letters.length-1; i++) {
            for (int j = 0; j < letters.length-1; j++) {
                if(!letters[i].equals(letters[j])){
                    if(!list.contains(letters[i])){
                        list.add(letters[i]);
                    }
                }
            }
        }
        System.out.println(list);

    }
}
