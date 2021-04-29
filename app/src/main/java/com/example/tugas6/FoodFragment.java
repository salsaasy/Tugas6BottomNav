package com.example.tugas6;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static com.example.tugas6.FoodDatabase.getListData;

public class FoodFragment extends Fragment implements OnItemClickListener<FoodModel>{
    private RecyclerView rvFood;
    private FoodAdapter adapter;

    public static FoodFragment newInstance() {
        FoodFragment fragment = new FoodFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_food, container, false);
        rvFood = view.findViewById(R.id.rv_food);
        adapter = new FoodAdapter();
        adapter.FoodAdapter(FoodDatabase.getListData());
        rvFood.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvFood.setHasFixedSize(true);
        adapter.setClickListener(this);
        rvFood.setAdapter(adapter);
        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onClick(FoodModel foodModel) {
        Intent intent = new Intent(getActivity(), Details.class);
        intent.putExtra("FOOD_DETAIL", foodModel);
        startActivity(intent);
    }
}