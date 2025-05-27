package Mustafa;

public class RemoveDuplicates {
    public static void main(String[] args) {

        System.out.println ("removeDuplicateLetters (\"AAABBCC\") = " + removeDuplicateLetters ("AAABBCC"));


    }

    public static String removeDuplicateLetters(String str) {
        String newString = "";

        for (int i = 0; i < str.length (); i++) {
            if (!newString.contains ("" + str.charAt (i))) {
                newString += str.charAt (i);
            }
        }
        return newString;
    }
}
/*
Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC")  ==> ABC
 */