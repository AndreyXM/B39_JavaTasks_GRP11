package Dina;

public class PasswordValidation {
    public static void main(String[] args) {
        String password = "ja36@E";
        System.out.println("validatePass(password) = " + validatePass(password));

    }

    public static boolean validatePass(String pass) {
        //checking base case first
        if (pass.length() < 6 || pass.contains(" ")) {
            return false;
        }

        boolean hasUppercase = false,
                hasLowercase = false,
                hasNumber = false,
                hasSpecialChar = false;

        for (int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (Character.isDigit(ch)) {
                hasNumber = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecialChar = true;
            }
        }
        if (hasUppercase && hasLowercase && hasNumber && hasSpecialChar) {
            return true;
        }else {
            return false;
        }
    }
}
/*
String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:
 1. Password must be at least have 6 characters and should not contain space
 2. Password should at least contain one upper case letter
 3. Password should at least contain one lowercase letter
 4. Password should at least contain one special characters
 5. Password should at least contain a digit

 if all requirements above are met, the method returns true, otherwise returns false

 */