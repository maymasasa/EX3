package com.example.ex3;

import android.widget.EditText;

public class LoginAuthenticator {
    public static boolean logAuth(EditText name, EditText password) {
        String name_ = name.getText().toString();
        String password_ = password.getText().toString();
        return (name_.equals("maymasasa") && password_.equals("12345678m"));
    }
}
