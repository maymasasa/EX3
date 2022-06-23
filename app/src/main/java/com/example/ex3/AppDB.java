package com.example.ex3;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.ex3.entities.User;

@Database(entities = {User.class}, version = 1)
public abstract class AppDB extends RoomDatabase {
    public abstract UserDao userDao();
}
