package com.example.market;


import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView shopRecyclerView;
    private ShopAdapter shopAdapter;
    private List<Shop> shopList;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shopRecyclerView = findViewById(R.id.shopRecyclerView);
        shopList = getShopList(); // Populate the shop list with data

        shopAdapter = new ShopAdapter(this, shopList);
        shopRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        shopRecyclerView.setAdapter(shopAdapter);
    }

    // Dummy method to populate the shop list with data
    private List<Shop> getShopList() {
        List<Shop> shopList = new ArrayList<>();

        // Add sample shop data
        shopList.add(new Shop("Shop 1", "Address 1"));
        shopList.add(new Shop("Shop 2", "Address 2"));
        shopList.add(new Shop("Shop 3", "Address 3"));
        shopList.add(new Shop("Shop 4", "Address 4"));
        // Add more shops as needed

        return shopList;
    }
}
