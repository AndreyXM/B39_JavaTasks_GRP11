package Dina;

public class Week4_ReverseNegNum {
    public static void main(String[] args) {
        int num = -125;
        int result = reverse(num);
        System.out.println("Number: " + num);
        System.out.println("Result: " + result);

    }

    public static int reverse(int x) {
        String s = Integer.toString(x).substring(1); //first convert to string then remove the first char "-"
        String rev = "-" + new StringBuilder(s.toString()).reverse(); //create a string builder then reverse it
        return Integer.parseInt(rev); //back convert to integer
    }
}
/*
Number -- Reverse negative number
Write a return method that can reverse negative number and return it as int

Sample: number= -125
        result= -521
 */