package com.waewaee.restaurantapp.holders;

import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.waewaee.restaurantapp.R;
import com.waewaee.restaurantapp.delegates.ShopsItemDelegate;

public class ShopsViewHolder extends RecyclerView.ViewHolder {

    private ShopsItemDelegate mDelegate;

    public ShopsViewHolder(@NonNull View itemView, @NonNull ShopsItemDelegate shopsItemDelegate) {
        super(itemView);
        mDelegate = shopsItemDelegate;

        Button btnDetail = itemView.findViewById(R.id.btn_shop_detail);

        btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDelegate.onTapShopsItem();
            }
        });
    }
}
