package com.example.meijertestjava;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class CouponAdapter extends RecyclerView.Adapter<CouponAdapter.CouponViewHolder> {

    private ArrayList<ListOfCoupon> couponList;

    public CouponAdapter(ArrayList<ListOfCoupon> couponList){
        this.couponList = couponList;
    }

    @NonNull
    @Override
    public CouponViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new CouponViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CouponViewHolder couponViewHolder, int i) {
        couponViewHolder.title.setText(couponList.get(i).getTitle());
        couponViewHolder.description.setText(couponList.get(i).getDescription());
        couponViewHolder.endDate.setText(couponList.get(i).getRedemptionEndDate());
        Picasso.get()
                .load(couponList.get(i).getImageURL())
                .into(couponViewHolder.image);
    }

    @Override
    public int getItemCount() {
        return couponList != null ? couponList.size() : 0;
    }

    public class CouponViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        TextView description;
        TextView endDate;
        ImageView image;

        public CouponViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.tv_title);
            description = itemView.findViewById(R.id.tv_description);
            endDate = itemView.findViewById(R.id.tv_end_date);
            image = itemView.findViewById(R.id.iv_image);
        }
    }
}
