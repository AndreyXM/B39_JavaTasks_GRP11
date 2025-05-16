package anna;

public class Week03_ReverseNegativeNumber {
    public static void main(String[] args) {
        int a = -76;
        System.out.println(reverseNegativeNum(a));

        int b = -890;
        System.out.println(reverseNegativeNum(b));

        int c = -125;
        System.out.println(reverseNegativeNum(c));
    }

    public static int reverseNegativeNum(int num) {
        if (num >= 0) {
            throw new IllegalArgumentException("Number must be negative");
        }
        String number = String.valueOf(num).substring(1);

        char[] chars = number.toCharArray();

        StringBuilder result = new StringBuilder("-");
        for (int i = chars.length - 1; i >= 0; i--) {
            result.append(chars[i]);
        }

        return Integer.parseInt(result.toString());

    }
}


