package com.example.ex3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.ex3.adapters.UsersListAdapter;
import com.example.ex3.entities.User;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class Chat extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        RecyclerView lstUsers = findViewById(R.id.lstUsers);
        final UsersListAdapter adapter = new UsersListAdapter(this);
        lstUsers.setAdapter(adapter);
        lstUsers.setLayoutManager(new LinearLayoutManager(this));
        List<User> users = new ArrayList<>();
        users.add(new User(1, "may", "hi", "11:11", R.drawable.maymasasa));
        users.add(new User(1, "may", "hi", "11:11", R.drawable.maymasasa));
        users.add(new User(1, "may", "hi", "11:11", R.drawable.maymasasa));
        users.add(new User(1, "may", "hi", "11:11", R.drawable.maymasasa));
        users.add(new User(1, "may", "hi", "11:11", R.drawable.maymasasa));
        users.add(new User(1, "may", "hi", "11:11", R.drawable.maymasasa));
        users.add(new User(1, "may", "hi", "11:11", R.drawable.maymasasa));
        users.add(new User(1, "may", "hi", "11:11", R.drawable.maymasasa));
        users.add(new User(1, "may", "hi", "11:11", R.drawable.maymasasa));

        adapter.setUsers(users);

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
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
