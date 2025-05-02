package sevinch;

public class Week1_OddOrEven {
    public static void main(String[] args) {
        oddOrEven(9);

    }
    public static void oddOrEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}
