package com.example.ex3;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {
    @PrimaryKey(autoGenerate = true)
    int id;
    String name;

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
    }

    public User() {

    }

    @Override
    public String toString() {
        return name + "\n\n" + "11:11" + "          " + "Last Message";
    }
}