package anna;

import java.util.HashMap;
import java.util.Map;


/*
 Write a return  method that can find the unique characters from the String
         Ex:  unique("AAABBBCCCDEF")  ==>  "DEF"
 */
public class Q7_FindTheUnique {
    public static void main(String[] args) {
        System.out.println("returnUnique(\"AAABBBCCCDEF\") = " + returnUnique("AAABBBCCCDEF"));
    }

    public static String returnUnique(String str) {
        Map<Character, Integer> seen = new HashMap<>();

        StringBuilder result = new StringBuilder();

        for (char eachChar : str.toCharArray()) {
            seen.put(eachChar, seen.getOrDefault(eachChar, 0) + 1);
        }

        for (char eachChar : str.toCharArray()) {
            if (seen.get(eachChar) == 1) {
                result.append(eachChar);
            }
        }
        return result.toString();
    }
}
