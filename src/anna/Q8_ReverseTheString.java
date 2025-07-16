package anna;

public class Q8_ReverseTheString {
    public static void main(String[] args) {
//          Write a return method that can reverse  String
//         Ex: Reverse("ABCD"); ==> DCBA
        System.out.println(reversed("ABCD"));
        System.out.println(reversed("ToString"));

    }

    public static String reversed(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
