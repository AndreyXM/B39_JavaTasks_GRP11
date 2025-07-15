package anna;

public class Q10_MinNumFromIntArray {
    //Write a method that can find the minimum number from an int Array
    public static void main(String[] args) {
        int[] numbers = {4, 2, 9, -1, 0, 5};
        System.out.println("Minimum number: " + findMinimum(numbers));
    }

    public static int findMinimum(int[] numbers) {
        int min = numbers[0];
        for (int eachNum : numbers) {
            if (eachNum < min) {
                min = eachNum;
            }
        }
        return min;
    }
}
