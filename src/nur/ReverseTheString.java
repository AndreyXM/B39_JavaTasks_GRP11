package nur;

public class ReverseTheString {
    public static void main(String[] args) {
        /*
         Write a return method that can reverse  String
         Ex: Reverse("ABCD"); ==> DCBA
         */
        String str = "ABCD";
        System.out.println(reverseString(str));
        System.out.println(reverseString2(str));
    }

    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char current = str.toCharArray()[i];
            reversed += current;
        }
        return reversed;
    }

    public static String reverseString2(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}
