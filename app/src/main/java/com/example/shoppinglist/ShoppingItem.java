package com.example.shoppinglist;

public class ShoppingItem {

    private String name;
    private String note;

    private int id;

    private static int idCounter;

    public ShoppingItem(String name, String note) {
        this.name = name;
        this.note = note;
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
}
