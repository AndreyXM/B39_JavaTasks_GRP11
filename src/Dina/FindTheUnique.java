package Dina;

public class FindTheUnique {
    public static void main(String[] args) {
        String str = "AAABBBCCCDEF";
        System.out.println("unique(\"AAABBBCCCDEF\") ===>  " + unique(str));
        System.out.println("findUnique(\"AAABBBCCCDEF\") ===>  " + findUnique(str));

    }
    public static String findUnique(String str) {
        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                unique += ch;
            }
        }
        return unique;
    }


    public static String unique(String str) {
        String uni = "";
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }
            if (count == 1){
                uni += ch;
            }
        }
        return uni;
    }
}

/*
Write a return method that can find the unique characters from the string
ex: unique("AAABBBCCCDEF") ===> "DEF"
 */