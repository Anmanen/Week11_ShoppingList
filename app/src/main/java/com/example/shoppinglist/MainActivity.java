package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rwShoppingItems);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ShoppingItemInfoAdapter(Storage.getInstance().getShoppingItemList(), this));
    }

    public void openAddShoppingItemView(View view){
        Intent intent = new Intent(this, AddShoppingItemActivity.class);
        startActivity(intent);
    }

    public void sortAlpha(View view){
        Storage.getInstance().sortAlphabetOrder();
        RecyclerView recyclerView = findViewById(R.id.rwShoppingItems);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ShoppingItemInfoAdapter(Storage.getInstance().getShoppingItemList(), this));

    }

    public void sortTime(View view){

    }
}