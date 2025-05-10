package Mustafa;

public class FinRa {
    public static void main(String[] args) {
        finraExample (30);
    }
    public static void finraExample(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 ==0 && i % 5 == 0) {  // we can write, i % 15 == 0  as well
                System.out.println ("FINRA");
            } else if (i % 3 == 0) {
                System.out.println ("FIN");
            } else if (i % 5 == 0) {
                System.out.println ("RA");
            } else {
                System.out.println (i);
            }
        }

    }
}
