package ru.job4j.early;

public class PasswordValidator {
    public static String validate(String password) {

        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (!(8 < password.length() && password.length() < 32)) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }

        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                break;
            } else {
                throw new IllegalArgumentException("Password should contain at least one uppercase letter");
            }
        }

        for (int i = 0; i < password.length(); i++) {
            if (password.matches("a-z")) {
                break;
            } else {
                throw new IllegalArgumentException("Password should contain at least one lowercase letter");
            }
        }

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                 break;
            } else {
                throw new IllegalArgumentException("Password should contain at least one figure");
            }
        }

        if (!password.matches("(?i)")) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        return password;
    }

}

