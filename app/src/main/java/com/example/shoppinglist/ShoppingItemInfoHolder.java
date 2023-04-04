package com.example.shoppinglist;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ShoppingItemInfoHolder extends RecyclerView.ViewHolder {

    TextView name;
    TextView note;

    ImageView delete;
    ImageView edit;

    public ShoppingItemInfoHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.txtItemName);
        note = itemView.findViewById(R.id.txtNote);

        delete = itemView.findViewById((R.id.imgDelete));
        edit = itemView.findViewById(R.id.imgEdit);

    }
}
