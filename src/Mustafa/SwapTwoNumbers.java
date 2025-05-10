package Mustafa;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 4;
        int b = 10;
        System.out.println ("Before swaping");
        System.out.println ("c = " + a);
        System.out.println ("d = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println ("Before swaping");
        System.out.println ("c = " + a);
        System.out.println ("d = " + b);


        System.out.println ("*********");

        int c = 7;
        int d = 5;
        System.out.println ("Before swaping");
        System.out.println ("c = " + c);
        System.out.println ("d = " + d);


        c = c * d; // 35
        d = c / d; //  7
        c = c / d; //  5

        System.out.println ("After swaping");
        System.out.println ("c = " + c);
        System.out.println ("d = " + d);

    }
}

