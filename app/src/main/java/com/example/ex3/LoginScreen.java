package com.example.ex3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(v -> {
            EditText name = findViewById(R.id.name);
            EditText password = findViewById(R.id.password);
            if(LoginAuthenticator.logAuth(name, password)) {
                Intent i = new Intent(this, Chat.class);
                startActivity(i);
            }
            else{
                TextView t = findViewById(R.id.IncorrectUsOrPass);
                t.setText("Incorrect Username or Password.");
            }
        });
        Button btnReg = findViewById(R.id.btnReg);
        btnReg.setOnClickListener(v -> {
            Intent i = new Intent(this, Register.class);
            startActivity(i);
        });
    }
}