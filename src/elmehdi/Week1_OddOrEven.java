package elmehdi;

public class Week1_OddOrEven {
    public static void main(String[] args) {
        oddOrEven(4);
    }

    public static void oddOrEven ( int num ){
         if (num % 2 == 0){
             System.out.println(num + " is an even number");
         }else {
             System.out.println(num + "is an odd number");
         }
    }
}
