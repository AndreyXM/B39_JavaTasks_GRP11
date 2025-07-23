package Dina;

public class Week3_Swap {
    public static void main(String[] args) {
        int num1 = 34;
        int num2 = 24;
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
// if ask for temp variable
//        int temp = num1;
//        num1 = num2;
//        num2 = temp;
        System.out.println("num 1 = " + num1);
        System.out.println("num 2 = " + num2);
    }
}
/*
SWAP NUMBERS
Swap 2 numbers without creating a 3rd variable
 */