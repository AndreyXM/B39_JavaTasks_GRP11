package anna;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    //    Remove Duplicates
//Write a return method that can remove the duplicated values from String
//Ex:  removeDup("AAABBBCCC")  ==> ABC
    public static void main(String[] args) {

        System.out.println("removeDuplicates(\"AAABBBCCC\") = " + removeDuplicates("AAABBBCCC"));
    }

    public static String removeDuplicates(String str) {
        Set<Character> seenChars = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (char eachChar : str.toCharArray()) {
            if (!seenChars.contains(eachChar)) {
            stringBuilder.append(eachChar);
            seenChars.add(eachChar);
            }
        }
        return stringBuilder.toString();
    }
}
