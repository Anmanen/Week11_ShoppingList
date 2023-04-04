package com.example.shoppinglist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Storage {

    private ArrayList<ShoppingItem> shoppingItemList= new ArrayList<>();

    private static Storage storage;

    private Storage(){

    }

    public static Storage getInstance(){
        if (storage == null){
            storage = new Storage();
        }
        return storage;
    }

    public ArrayList<ShoppingItem> getShoppingItemList() {
        return shoppingItemList;
    }

    public void addShoppingItem(ShoppingItem sItem){
        shoppingItemList.add(sItem);
    }

    public void removeShoppingItem(int key){
        shoppingItemList.remove(key);
    }

}
