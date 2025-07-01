package nur;

public class PasswordValidation {
    public static void main(String[] args) {
        String password = "Sv67T*";
        String password2 = "v67T*";
        String password3 = "Sv67Tndgh";

        System.out.println(isPasswordValid(password)); //true
        System.out.println(isPasswordValid(password2)); //false ->length=5
        System.out.println(isPasswordValid(password3));  //false ->does not contain special char

    }

    public static boolean isPasswordValid(String str) {
        boolean isValid = false;
        boolean containsUpperCase = false;
        boolean containsLowerCase = false;
        boolean containsSpecialCharacter = false;
        boolean containsDigit = false;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                containsUpperCase = true;
            }
            if (Character.isLowerCase(str.charAt(i))) {
                containsLowerCase = true;
            }
            if (!Character.isLetterOrDigit(str.charAt(i))) {
                containsSpecialCharacter = true;
            }
            if (Character.isDigit(str.charAt(i))) {
                containsDigit = true;
            }
        }


        if (str.length() >= 6 && !str.isBlank() && !str.contains(" ") &&
                containsUpperCase && containsLowerCase && containsSpecialCharacter
                && containsDigit) {
            isValid = true;
        }

        return isValid;
    }
}
