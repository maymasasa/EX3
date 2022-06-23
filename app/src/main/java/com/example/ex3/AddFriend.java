package com.example.ex3;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import com.example.ex3.entities.User;

public class AddFriend extends AppCompatActivity {
    private AppDB db;
    private UserDao userDao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_friend);
        db = Room.databaseBuilder(getApplicationContext(), AppDB.class, "UserDB").allowMainThreadQueries().build();
        userDao = db.userDao();

        Button addBtn = findViewById(R.id.save);
        addBtn.setOnClickListener(view-> {
            EditText etItem = findViewById(R.id.friendString);
            User user = new User(0,etItem.getText().toString(), "", "", R.drawable.maymasasa);
            finish();
        });


    }
}