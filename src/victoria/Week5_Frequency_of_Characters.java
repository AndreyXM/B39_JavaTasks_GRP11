package victoria;

public class Week5_Frequency_of_Characters {
    public static void main(String[] args) {

        String result = frequencyOfChars("AAABBCDD");
        System.out.println(result);


    }

    public static String frequencyOfChars(String str) {
        String result = "";
        String checked = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (checked.contains("" + ch)) {
                continue;
            }

            int count = 0;
            for (int l = 0; l < str.length(); l++) {
                if (str.charAt(l) == ch) {
                    count++;
                }
            }

            result += ch + "" + count;
            checked += ch;
        }

        return result;
    }
}

/*

Write a return method that can find the frequency of characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

*/