package com.example.ex3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class Chat extends AppCompatActivity {
    private AppDB db;
    private UserDao userDao;
    private MessageDao messageDao;
    ListView lvUsers;
    private List<User> users;
    ArrayAdapter<User> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        db = Room.databaseBuilder(getApplicationContext(),AppDB.class, "UsersDB").allowMainThreadQueries().build();
        messageDao = db.messageDao();
        userDao = db.userDao();
        FloatingActionButton addBtn = findViewById(R.id.btnAdd);
        addBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, AddFriend.class);
            startActivity(intent);
        });
        users = userDao.index();
        lvUsers = findViewById(R.id.lvUsers);
        adapter = new ArrayAdapter<User>(this, android.R.layout.simple_list_item_1,users);
        lvUsers.setAdapter(adapter);
        lvUsers.setOnItemLongClickListener((adapterView, view, i, l) -> {
             User user = users.remove(i);
             userDao.delete(user);
             adapter.notifyDataSetChanged();
             return true;
             });
    }

    @Override
    protected void onResume() {
        super.onResume();
        users.clear();
        users.addAll(userDao.index());
        adapter.notifyDataSetChanged();

    }
}