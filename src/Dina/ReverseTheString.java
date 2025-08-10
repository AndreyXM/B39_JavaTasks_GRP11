package Dina;

public class ReverseTheString {
    public static void main(String[] args) {
        String string = "ABCD";
        System.out.println("reverse(\"ABCD\") = " + reverse(string));
    }

    public static String reverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }
}

/*
Write a return method that can reverse String
ex: Reverse("ABCD"); ==> DCBA
 */