package Mustafa;
/*
      Write a return method that can reverse  String
         Ex: Reverse("ABCD"); ==> DCBA
 */

public class ReverseTheString {
    public static void main(String[] args) {
        System.out.println (reversedString ("ABCD"));
        System.out.println (test ("ABCD"));
    }
    public static String reversedString(String str){
        StringBuilder reversed = new StringBuilder ();

        for (int i = str.length () -1; i >= 0; i--){
            reversed.append (str.charAt (i));
        }
        return reversed.toString ();
    }

    // OPTION 2 FOR STRING REVERSE

    public static String test(String str){
        StringBuilder srb = new StringBuilder (str);
        return srb.reverse().toString();
    }
}
