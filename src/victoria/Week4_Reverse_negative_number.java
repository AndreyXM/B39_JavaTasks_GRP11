package victoria;

public class Week4_Reverse_negative_number {
    public static void main(String[] args) {

        System.out.println(reverseNegative(-125));
    }

    public static int reverseNegative(int number) {
        String str = Integer.toString(number);
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (ch != '-') {
                reversed += ch;
            }
        }

        int result = Integer.parseInt(reversed);
        return number < 0 ? -result : result;
    }
}
/*

Number -- Reverse negative number
Write a return method that can reverse negative number and return it as int

Sample: number= -125
        result= -521
*/
