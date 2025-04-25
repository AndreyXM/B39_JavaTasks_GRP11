package FatimaZahra;

public class week1_OddOrEven {
    public static void main(String[] args) {

        //call our OddOrEven method
        oddOrEven(13);

    }
    // Create a method that print if an int is Odd Or Even

    public static void oddOrEven(int number){
        if( number % 2 == 0){
            System.out.println("The number " + number + " is Even.");
        }else{
            System.out.println("The number " + number + " is Odd.");
        }
    }
}
