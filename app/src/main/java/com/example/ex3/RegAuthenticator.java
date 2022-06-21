package com.example.ex3;

import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * How to deal with a case of a null?
 * Any forbidden symbols?
 */
public class RegAuthenticator {
    private static final String PASSWORD_PATTERN =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
    private static final String USERNAME_PATTERN =
            "^[a-zA-Z0-9]([._-](?![._-])|[a-zA-Z0-9]){3,18}[a-zA-Z0-9]$";
    private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
    private static final Pattern pattern2 = Pattern.compile(USERNAME_PATTERN);

    /*
        Comparing with 2 passwords in the registration screen.
     */
    public static boolean matchPass(EditText password_1, EditText password_2) {
        String password1 = password_1.toString();
        String password2 = password_1.toString();
        if (password2 != null)
            return password1.equals(password2);
        return false;
    }

    /*
        Validating name/username using regex.
     */
    public static boolean nameAuth(EditText name) {
        /* Are there any other validations?(like comparing with DB) */
        String name_ = name.toString();
        Matcher matcher = pattern2.matcher(name_);
        return matcher.matches();
    }

    /*
        Validating password using regex.
    */
    public static boolean passAuth(EditText password) {
        String password_ = password.toString();
        Matcher matcher = pattern.matcher(password_);
        return matcher.matches();
    }

    /*
    using the class functions in order to validate the creation of a new user;
     */
    public static boolean authorizer(EditText username,
                                     EditText nickname, EditText password1, EditText password2) {
        return passAuth(password1) && nameAuth(nickname) &&
                nameAuth(username) && matchPass(password1, password2);

    }
}
