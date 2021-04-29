package com.example.tugas6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder>{
    private List<FoodModel> models;
    private OnItemClickListener<FoodModel> clickListener;

    public void FoodAdapter(List<FoodModel> models) {
        this.models = models;
    }

    public void setClickListener(OnItemClickListener<FoodModel> clickListener) {
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodAdapter.ViewHolder holder, int position) {
        holder.onBind(models.get(position));
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        FoodModel food;
        ImageView ivFoodPhoto;
        TextView tvFoodName;
        TextView tvFoodDesc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            ivFoodPhoto = itemView.findViewById(R.id.iv_food_photo);
            tvFoodName = itemView.findViewById(R.id.tv_food_name);
            tvFoodDesc = itemView.findViewById(R.id.tv_food_desc);
        }
        public void onBind(FoodModel food){
            this.food = food;
            ivFoodPhoto.setBackgroundResource(food.getPhoto());
            tvFoodName.setText(food.getName());
            tvFoodDesc.setText(food.getDesc());
        }

        @Override
        public void onClick(View v) {
            clickListener.onClick(food);
        }
    }
}

