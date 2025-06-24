package anna;

public class FrequencyOfCharacters {
    //          Write a return method that can find the frequency of characters
//         Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
//
    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDD"));
    }

    public static String frequencyOfChars(String str) {
        StringBuilder stb = new StringBuilder();
        String checked = "";

        for (char i : str.toCharArray()) {
            int count = 0;

            if (checked.contains(String.valueOf(i))) {
                continue;
            }

            for (char j : str.toCharArray()) {
                if (j == i) {
                    count++;
                }
            }
            stb.append(i).append(count);
            checked += i;
        }
        return stb.toString();
    }
}
