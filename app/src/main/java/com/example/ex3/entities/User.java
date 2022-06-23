package com.example.ex3.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.ex3.R;

@Entity
public class User {
    @PrimaryKey(autoGenerate = true)
    int id;
    String name;
    String lastMessage;
    String time;
    int pic;

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

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


    public User(int id, String name, String lastMessage, String time, int pic) {
        this.id = id;
        this.name = name;
        this.lastMessage = "ערה?";
        this.time = "11:11";
        this.pic = R.drawable.maymasasa;
    }

    public User() {

    }

    @Override
    public String toString() {
        return name + "\n\n" + time + "          " + lastMessage;
    }
}