package com.example.ex3;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {User.class, Message.class}, version = 1)
public abstract class AppDB  extends RoomDatabase{
    public abstract UserDao userDao();
    public abstract MessageDao messageDao();
}
