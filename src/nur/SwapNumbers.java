package nur;

public class SwapNumbers {
    public static void main(String[] args) {

        /*
        SWAP NUMBERS
      Swap 2 numbers without creating a 3rd variable
         */
        int a=10;
        int b=5;
        a=a+b; //a=15
        b=a-b; //15-5=10 ,b=10
        a=a-b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("-----------------------");

        swapNumbers(4,5);

        System.out.println("-----------------------");
    }
    public static void swapNumbers(int q,int w) {
        q+=w;
        w=q-w;
        q=q-w;
        System.out.println("q = " + q);
        System.out.println("w = " + w);
    }
}
