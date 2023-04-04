package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddShoppingItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_shopping_item);
    }

    public void addShoppingItem(View view){
        EditText name = findViewById(R.id.etxtShoppingItemName);
        EditText note =findViewById(R.id.etxtNote);

        ShoppingItem sItem = new ShoppingItem(name.getText().toString(), note.getText().toString());
        Storage.getInstance().addShoppingItem(sItem);

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}