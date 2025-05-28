package nur;

public class FrequencyOfCharacters {
    public static String FrequencyOfChars(String str) {
        String result = "";
        String checked = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (checked.indexOf(ch) == -1) {
                int count = 0;
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == ch) {
                        count++;
                    }}
                result += "" + ch + count;
                checked += ch;
            }}
        return result;
    }
    public static void main(String[] args) {
        System.out.println(FrequencyOfChars("AAABBCDD"));  // Output: A3B2C1D2
    }

    /*public static void frequencyOfCharacter(String s) {
        char[] ch = s.trim().toCharArray();
        boolean[] counted = new boolean[ch.length];

        for (int i = 0; i < ch.length; i++) {
            if (counted[i]) {
                continue; // Skip already counted characters
            }

            int count = 1; // Start counting from 1 (the current character itself)

            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    counted[j] = true; // Mark this char as counted
                }
            }

            System.out.print(" "+ch[i] + " = " + count);
        }
    }*/

}
