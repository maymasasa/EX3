package com.example.ex3;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

public class AddFriend extends AppCompatActivity {
    private AppDB db;
    private UserDao userDao;
    private MessageDao messageDao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_friend);

        db = Room.databaseBuilder(getApplicationContext(),AppDB.class, "UsersDB").allowMainThreadQueries().build();
        messageDao = db.messageDao();
        userDao = db.userDao();

        Button addBtn = findViewById(R.id.save);
        addBtn.setOnClickListener(view-> {
            EditText eyItem = findViewById(R.id.friendString);
            User user = new User(0,eyItem.getText().toString());
            userDao.insert(user);
            finish();
        });


    }
}