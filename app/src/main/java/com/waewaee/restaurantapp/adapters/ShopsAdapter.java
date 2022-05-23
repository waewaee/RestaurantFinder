package com.waewaee.restaurantapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.waewaee.restaurantapp.R;
import com.waewaee.restaurantapp.delegates.ShopsItemDelegate;
import com.waewaee.restaurantapp.holders.ShopsViewHolder;

public class ShopsAdapter extends RecyclerView.Adapter<ShopsViewHolder> {

    private ShopsItemDelegate mShopsItemDelegate;

    public ShopsAdapter(ShopsItemDelegate shopsItemDelegate) { mShopsItemDelegate = shopsItemDelegate; };

    @NonNull
    @Override
    public ShopsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.view_item_shop, parent, false);
        return new ShopsViewHolder(itemView, mShopsItemDelegate);
    }

    @Override
    public void onBindViewHolder(@NonNull ShopsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
