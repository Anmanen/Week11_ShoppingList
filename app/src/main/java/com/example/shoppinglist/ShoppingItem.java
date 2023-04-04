package com.example.shoppinglist;

import android.os.Build;

import java.time.LocalDateTime;

public class ShoppingItem {

    private String name;
    private String note;

    private LocalDateTime addingTime;

    private int id;

    private static int idCounter;

    public ShoppingItem(String name, String note) {
        this.name = name;
        this.note = note;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            this.addingTime = LocalDateTime.now();
        }
        this.id = idCounter;
        idCounter++;
    }

    public String getName() {
        return name;
    }

    public String getNote() {
        return note;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getAddingTime() {
        return addingTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
