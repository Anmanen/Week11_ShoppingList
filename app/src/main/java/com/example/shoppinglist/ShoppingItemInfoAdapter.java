package com.example.shoppinglist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;

public class ShoppingItemInfoAdapter extends RecyclerView.Adapter<ShoppingItemInfoHolder> {

    private ArrayList<ShoppingItem> shoppingItemList= new ArrayList<>();
    private Context context;

    public ShoppingItemInfoAdapter(ArrayList<ShoppingItem> shoppingItemList, Context context) {
        this.shoppingItemList = shoppingItemList;
        this.context = context;
    }

    @NonNull
    @Override
    public ShoppingItemInfoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.shopping_item_info, parent, false);
        ShoppingItemInfoHolder holder = new ShoppingItemInfoHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ShoppingItemInfoHolder holder, int position) {

        holder.name.setText(shoppingItemList.get(holder.getAdapterPosition()).getName());
        holder.note.setText(shoppingItemList.get(holder.getAdapterPosition()).getNote());

        holder.edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        holder.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Storage.getInstance().removeShoppingItem(holder.getAdapterPosition());
                notifyItemRemoved(holder.getAdapterPosition());
            }
        });
    }

    @Override
    public int getItemCount() {
        return shoppingItemList.size();
    }
}
