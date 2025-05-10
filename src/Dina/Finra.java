package Dina;

public class Finra {
    public static void main(String[] args) {
        finra(14);


    }

    public static void finra(int num){
        if ( num / 3 == 0){
            System.out.println("FIN");
        } else if (num / 5 == 0){
            System.out.println("RA");
        } else {
            System.out.println("FINRA");
        }

    }
}
/*
FINRA :
Write a method which prints out the numbers from 1 to 30
but if the number is a multiple of 3,
print "FIN" instead of the number and if the number is multiple of 5,
print "RA" instead of the number.
If the number is a multiple of both 3 and 5, then print "FINRA"
instead of the number.


Example:
1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA ...
 */
