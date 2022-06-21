package com.example.ex3;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Message {
    @PrimaryKey(autoGenerate=true)
    private int id;
    private String content;
    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Message(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public Message() {
    }
}
