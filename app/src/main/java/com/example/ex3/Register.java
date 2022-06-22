package com.example.ex3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_register);
        Button RegBtn = findViewById(R.id.btnReg2);

        RegBtn.setOnClickListener(view -> {

            EditText nickname = findViewById(R.id.nickname);
            EditText username = findViewById(R.id.username2);
            EditText password = findViewById(R.id.editTextTextPassword3);
            EditText password2 = findViewById(R.id.editTextTextPassword4);

            if(RegAuthenticator.authorizer(username, nickname, password, password2)) {
                Intent intent = new Intent(this, Chat.class);
                startActivity(intent);
            }

            else {
                TextView t = findViewById(R.id.IncorrectData);
                t.setText("One or more fields are not valid.");
            }
        });
    }

}