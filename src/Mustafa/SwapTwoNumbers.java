package Mustafa;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 4;
        int b = 10;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println ("a = " + a);
        System.out.println ("b = " + b);


        System.out.println ("*********");

        int c = 10;
        int d = 15;
        int swap;

        swap = c;
        c = d;
        d = swap;

        System.out.println ("c = " + c);
        System.out.println ("d = " + d);


    }
}
