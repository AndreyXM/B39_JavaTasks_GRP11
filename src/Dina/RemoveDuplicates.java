package Dina;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String string = "AAABBBCCC";
        System.out.println("removeDup(str) = " + removeDup(string));

    }

    public static String removeDup(String str){
        String uniqueChar = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // each time the loop runs this line take the next character
            //we are checking if the character is not in the uniqueAlpha
            //to avoid duplicate
            if (!uniqueChar.contains(String.valueOf(ch))) {
                uniqueChar += ch; // wel will add it
            }
        }
        return uniqueChar;
    }
}
/*
Write a return method that can remove the duplicated values
from String Ex: removeDup("AAABBBCCC") ===> ABC
 */