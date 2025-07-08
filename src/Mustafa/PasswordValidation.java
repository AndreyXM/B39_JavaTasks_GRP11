package Mustafa;

public class PasswordValidation {
    public static void main(String[] args) {
        System.out.println ("**INVALID COMBINATIONS**");
        System.out.println (validatePassword (null));
        System.out.println (validatePassword ("ALL_UPPERCASE1@"));
        System.out.println (validatePassword ("all_lowercase1@"));
        System.out.println (validatePassword ("Ad1@"));
        System.out.println ("**VALID COMBINATIONS");
        System.out.println (validatePassword ("ValidPassword1@"));
        System.out.println (validatePassword ("AtLeast6characters@"));
        System.out.println (validatePassword ("JavaIsFun2&1"));
    }

    public static boolean validatePassword(String password) {

        return (password != null
                && !password.contains (" ")
                && password.length () >= 6
                && password.matches (".*[a-z].*")
                && password.matches (".*[A-Z].*")
                && password.matches (".*[@#$%&*].*"));

    }
}

/*
Write a return method that can verify if a password is valid or not
- Password must be at least having 6 characters and should not contain space
- Password should at least contain one upper case letter
- Password should at least contain one lowercase letter
- Password should at least contain one special character
- Password should at least contain a digit

If all requirements above are met, the method returns true, otherwise false.
 */
