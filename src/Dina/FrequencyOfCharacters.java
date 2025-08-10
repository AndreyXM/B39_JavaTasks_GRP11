package Dina;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String string = "AAABBCDD";
        System.out.println("FreqOfChar(" + string + ") = " + FreqOfChar(string));
        System.out.println("FreqOfChar2(" + string + ") = " + FreqOfChar2(string));

    }
    public static String FreqOfChar(String str) {
        String frequency = "";

        for ( int i = 0; i < str.length(); i++ ) {
            char ch = str.charAt(i);
            int counter = 0;
            if (frequency.contains("" + ch)) continue;
            for (int j = 0; j < str.length(); j++ ) {
                if (str.charAt(j) == ch) {
                    counter++;
                }
            }
            frequency += "" + ch + counter;

        }

        return frequency;
    }

    public static String FreqOfChar2(String str) {
        String freq = "";
        for (char ch : str.toCharArray()) { // convert a string into an array of chars (char[])
            if (freq.contains("" + ch)) continue;
            int counter = 0;
            for (char each : str.toCharArray()) {
                if (each == ch) {
                    counter++;
                }

            }
            freq += "" + ch + counter;
        }
        return freq;
    }
}
/*
Write a return method that can find the frequency of characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */