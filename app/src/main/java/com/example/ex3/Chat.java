package com.example.ex3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class Chat extends AppCompatActivity {
    ListView lvUsers;
    private List<User> users;
    ArrayAdapter<User> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        FloatingActionButton addBtn = findViewById(R.id.btnAdd);
        addBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, AddFriend.class);
            startActivity(intent);
        });
        FloatingActionButton settingsBtn = findViewById(R.id.floatingSettingsBtn);
        settingsBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, Settings.class);
            startActivity(intent);
        });
        lvUsers = findViewById(R.id.lvUsers);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}