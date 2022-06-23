package com.example.ex3;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AddFriend extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_friend);
        Button addBtn = findViewById(R.id.save);
        addBtn.setOnClickListener(view-> {
            EditText eyItem = findViewById(R.id.friendString);
            User user = new User(0,eyItem.getText().toString());
            finish();
        });


    }
}