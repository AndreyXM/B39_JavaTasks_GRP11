package nur;
import java.util.ArrayList;
import java.util.Collections;


public class FindTheUnique {
    /*
     Write a return  method that can find the unique characters from the String
         Ex:  unique("AAABBBCCCDEF")  ==>  "DEF"

     */
    public static void main(String[] args) {
        System.out.println(findUnique("AAABBBCCCDEF"));
        System.out.println(findUnique2("AAABBBCCCDEF"));
    }

    public static String findUnique(String str) {
        String unique = "";

        ArrayList<Character> letters = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            letters.add(str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int fre = Collections.frequency(letters, ch);
            if (!unique.contains(String.valueOf(ch)) && fre == 1) {
                unique += ch;
            }
        }
        return unique;
    }
    public static String findUnique2(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
