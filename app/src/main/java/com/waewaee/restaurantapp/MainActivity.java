package com.waewaee.restaurantapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.waewaee.restaurantapp.activities.ShopDetailActivity;
import com.waewaee.restaurantapp.adapters.ShopsAdapter;
import com.waewaee.restaurantapp.delegates.ShopsItemDelegate;

public class MainActivity extends AppCompatActivity implements ShopsItemDelegate {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rv_shops);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL, false));

        ShopsAdapter shopsAdapter = new ShopsAdapter(this);
        recyclerView.setAdapter(shopsAdapter);
    }

    @Override
    public void onTapShopsItem() {
        Intent intent = new Intent(getApplicationContext(), ShopDetailActivity.class);
        startActivity(intent);
    }
}