package Mustafa;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        System.out.println ("frequencyOfCharacter (\"AAABBCDD\") = " + frequencyOfCharacter ("AAABBCDD"));
    }

    public static String frequencyOfCharacter(String str) {
        String checked = "";

        for (int i = 0; i < str.length (); i++) {
            if (checked.contains ("" + str.charAt (i))) {
                continue;
            }
            int count = 0;
            for (int j = 0; j < str.length (); j++) {
                if (str.charAt (i) == str.charAt (j)) {
                    count++;
                }
            }
            checked += str.charAt (i) + "" + count;
        }
        return checked;
    }
}
