package anna;

public class Week01_OddOrEven {

    public static void main(String[] args) {
    oddOrEven(7);

    }
    public static void oddOrEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}
