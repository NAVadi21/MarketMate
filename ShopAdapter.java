package com.example.market;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View; 
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.ShopViewHolder> {

    private Context context;
    
    private List<Shop> shopList;

    public ShopAdapter(Context context, List<Shop> shopList) {
        this.context = context;
        this.shopList = shopList;
    }

    @NonNull
    @Override
    public ShopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_shop, parent, false);
        return new ShopViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ShopViewHolder holder, int position) {
        Shop shop = shopList.get(position);
        holder.shopNameTextView.setText(shop.getName());

        // Handle item click
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open a new window or activity to display additional information about the shop
                Intent intent = new Intent(context, ShopDetailActivity.class);
                intent.putExtra("Shop", Shop); // Pass the shop object to the new activity
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return shopList.size();
    }

    public class ShopViewHolder extends RecyclerView.ViewHolder {
        public TextView shopNameTextView;

        public ShopViewHolder(@NonNull View itemView) {
            super(itemView);
            shopNameTextView = itemView.findViewById(R.id.shopNameTextView);

            // Set item click listener
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Get the clicked shop item
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        Shop clickedShop = shopList.get(position);
                        // Handle click event for the shop item
                        // Open a new window with additional information on the shop
                    }
                }
            });
        }
    }
}
