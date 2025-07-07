package nur;

public class FindTheMinimumNumber {
    public static void main(String[] args) {
        int[] numbers = {-1, 5, 8, 100, 999};
        int[] numbers2 = {-999, -45, -78, -198, 9};

        System.out.println(minimumNumber(numbers));
        System.out.println(minimumNumber(numbers2));
    }

    public static int minimumNumber(int[] arr) {

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
}
