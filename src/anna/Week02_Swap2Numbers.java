package anna;

public class Week02_Swap2Numbers {

    public static void main(String[] args) {
        int a = 5;
        int b = 8;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        a = a + b;

        b = a - b;

        a = a - b;

        System.out.println("After swap: a = " + a + ", b = " + b);

    }

}
