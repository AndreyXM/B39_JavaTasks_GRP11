package Dina;

public class Week1_OddOrEven {
    public static void main(String[] args) {
        oddOrEven(8);
        oddOrEven(11);
    }

    public static int oddOrEven(int num) {
        if (num % 2 == 0){
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd" );
        }
        return num;
    }
}
