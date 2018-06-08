package com.example.asus.bhagalpur.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asus.bhagalpur.Adapters.LocationAdapter;
import com.example.asus.bhagalpur.LocationModelClass;
import com.example.asus.bhagalpur.R;

import java.util.ArrayList;
import java.util.List;


public class FoodFragment extends Fragment {

    List<LocationModelClass> FoodList = new ArrayList<>();
    LocationAdapter FoodAdapter;
    RecyclerView recyclerView3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_food, container, false);

        recyclerView3 = view.findViewById(R.id.recyclerViewFood);
        FoodAdapter =new LocationAdapter(FoodList,getContext());
        recyclerView3.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView3.setAdapter(FoodAdapter);

        FoodList.add(new LocationModelClass("Royal Darbar Resturant",R.drawable.rdarbar));
        FoodList.add(new LocationModelClass("Adarsh Jalpan",R.drawable.adarsh));
        FoodList.add(new LocationModelClass("Metro Mirchi Resturant",R.drawable.metromrichi));
        FoodList.add(new LocationModelClass("Big Bite Rolls",R.drawable.bigbite));
        FoodList.add(new LocationModelClass("Lazeez Resturant",R.drawable.lazeez));
        FoodList.add(new LocationModelClass("Gokul Sweets",R.drawable.gokul));
        FoodList.add(new LocationModelClass("Domino's",R.drawable.dom));
        FoodList.add(new LocationModelClass("V's Fun & Food",R.drawable.v));
        FoodList.add(new LocationModelClass("Street foods",R.drawable.street));


        return view;
    }


}
