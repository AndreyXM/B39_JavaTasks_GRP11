package Mustafa;

public class FindTheUnique {
    public static void main(String[] args) {
        System.out.println ("unique ( \"AAABBBCCCDEF\") = " + "\"" + findTheUnique ("AAABBBCCCDEF") + "\"");
    }

    public static String findTheUnique(String str) {
        StringBuilder uniqueStr = new StringBuilder ();

        for (int i = 0; i < str.length (); i++) {
            char ch = str.charAt (i);
            if (str.indexOf (ch) == str.lastIndexOf (ch)) {
            uniqueStr.append (ch);
            }
        }
        return uniqueStr.toString ();
    }
}
/*
Write a return  method that can find the unique characters from the String
         Ex:  unique("AAABBBCCCDEF")  ==>  "DEF"
 */
