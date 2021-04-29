package com.example.tugas6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    private ImageView ivFoodPhoto;
    private TextView tvFoodName;
    private TextView tvFoodDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ivFoodPhoto = findViewById(R.id.iv_detail_photo);
        tvFoodName = findViewById(R.id.tv_detail_name);
        tvFoodDesc = findViewById(R.id.tv_detail_desc);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    protected void onStart() {
        super.onStart();
        FoodModel food = getIntent().getParcelableExtra("FOOD_DETAIL");
        tvFoodName.setText(food.getName());
        tvFoodDesc.setText(food.getDesc());
        ivFoodPhoto.setImageResource(food.getPhoto());
        getSupportActionBar().setTitle(food.getName());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}