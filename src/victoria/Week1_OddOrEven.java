package victoria;

public class Week1_OddOrEven {

    public static void main(String[] args) {
        oddOrEven(5);
        oddOrEven(8);
        oddOrEven(0);
        oddOrEven(-7);
        oddOrEven(-6);
    }

    public static void oddOrEven(int num) {
        if (num == 0) {
            System.out.println("Although " + num + " is accepted an even number but it's a special number.");
        } else if (num % 2 == 0) {
            System.out.println(num + " is even number.");
        } else {
            System.out.println(num + " is odd number.");
        }

    }
}
