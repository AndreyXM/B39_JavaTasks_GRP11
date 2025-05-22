package victoria;

public class Week3_Swap_numbers {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 10;

        System.out.println("Initial values of num1 is " + num1  + " " + " and num2 is " + num2);

        num1 = num1 - num2;
        num2 = num2 + num1;
        num1 = num2 + num2;

        System.out.println("Final values of num1 is " + num1  + " " + " and num2 is " + num2);
    }
}


/*

SWAP NUMBERS
Swap 2 numbers without creating a 3rd variable

*/