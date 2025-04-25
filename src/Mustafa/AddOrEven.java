package Mustafa;

public class AddOrEven {
    public static void main(String[] args) {
        oddOrEven (21);
        oddOrEven (20);
    }

    public static void oddOrEven(int num) {
        if (num % 2 == 0) {
            System.out.println (num + " is an even number");
        }else if (num % 2 == 1){
            System.out.println (num + " is an odd number");

        }else {
            System.out.println (num + " is zero");
        }

    }
}


