package nur;

public class ReverseNegativeNumber {
    //Number -- Reverse negative number
    //Write a return method that can reverse negative number and return it as int
    //
    //Sample: number= -125
    //        result= -521
    public static void main(String[] args) {
        System.out.println(reverseNegative(-125));
    }
    public static int reverseNegative(int number){
        int reversed = 0;
        number *=(-1); //125
        while(number>0){
            //find last digit: -5- -> -2- -> -1-
            int lastDigit = number % 10;
            //((5*0)+5)=5 -> 52 -> 521
            reversed = reversed * 10 + lastDigit;
            //12 -> 1 ->!done
            number/=10;
        }
        return reversed*(-1);
    }
}
