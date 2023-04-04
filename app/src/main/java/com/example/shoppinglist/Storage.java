package com.example.shoppinglist;

import java.util.HashMap;

public class Storage {

    private HashMap<Integer, ShoppingItem> shoppingItemHashMap= new HashMap<>();

    private static Storage storage;

    private Storage(){

    }

    public static Storage getInstance(){
        if (storage == null){
            storage = new Storage();
        }
        return storage;
    }

    public HashMap<Integer, ShoppingItem> getShoppingItemHashMap() {
        return shoppingItemHashMap;
    }

    public void addShoppingItem(int key, ShoppingItem sItem){
        shoppingItemHashMap.put(key, sItem);
    }

}
