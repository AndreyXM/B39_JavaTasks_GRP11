package anna;

public class Week9_PasswordValidation {
    /*
    String -- Password Validation Task
    1. Write a return method that can verify if a password is valid or not.
    2. Password MUST be at least 6 characters and should not contain space
    3. Password should at least contain one uppercase letter
    4. Password should at least contain one lowercase letter
    5. Password should at least contain one special character
    6. Password should at least contain one digit

     */

    public static boolean isValidPassword(String password) {

        if (password == null) return false;

        if (password.length() < 6) return false;

        if (password.contains(" ")) return false;

        if (!password.matches(".*[A-Z].*")) return false;

        if (!password.matches(".*[a-z].*")) return false;

        if (!password.matches(".*\\d.*")) return false;

        return password.matches(".*[^a-zA-Z0-9].*");
    }

    public static void main(String[] args) {
        String test1 = "Password1!";
        String test2 = "bad";
        System.out.println(isValidPassword(test1)); // true
        System.out.println(isValidPassword(test2)); // false
    }
}
