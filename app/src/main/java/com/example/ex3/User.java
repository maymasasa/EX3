package com.example.ex3;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {
    @PrimaryKey(autoGenerate = true)
    int id;
    String name;
    String lastMessage;
    String time;
    int pic;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.lastMessage = "last Message";
        this.time = "11:11";
    }

    public User() {

    }

    @Override
    public String toString() {
        return name + "\n\n" + time + "          " + lastMessage;
    }
}