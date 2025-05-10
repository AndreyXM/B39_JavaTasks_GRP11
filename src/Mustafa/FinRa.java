package Mustafa;

public class FinRa {
    public static void main(String[] args) {
        finraExample (30);
    }
    public static void finraExample(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 ==0 && i % 5 == 0) {  // we can write, i % 15 == 0  as well
                System.out.print ("FINRA ");
            } else if (i % 3 == 0) {
                System.out.print ("FIN ");
            } else if (i % 5 == 0) {
                System.out.print ("RA ");
            } else {
                System.out.print ( i + " " );
            }
        }

    }
}
/*
  public static void main(String[] args) {
        finra(30);
    }

    public static void finra(int num){
        for(int i=1; i <= num; i++){
            if (i % 15 == 0) System.out.print("FINRA ");
            else if (i % 5 == 0) System.out.print("RA ");
            else if (i % 3 == 0) System.out.print("FIN ");
            else System.out.print(i + " ");
        }
    }
 */