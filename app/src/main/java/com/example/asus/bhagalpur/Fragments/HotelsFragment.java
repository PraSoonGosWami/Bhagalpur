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


public class HotelsFragment extends Fragment {


    List<LocationModelClass> HotelList = new ArrayList<>();
    RecyclerView recyclerView1;
    LocationAdapter HotelAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_hotels, container, false);
        recyclerView1 = view.findViewById(R.id.recyclerViewHotels);
        HotelAdapter =new LocationAdapter(HotelList,getContext());
        recyclerView1.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView1.setAdapter(HotelAdapter);
        HotelList.add(new LocationModelClass("Hotel Rajhansha International",R.drawable.rajhans));
        HotelList.add(new LocationModelClass("Hotel Bhawna International",R.drawable.bhawna));
        HotelList.add(new LocationModelClass("Hotel Ashoka Grand",R.drawable.ashoka));
        HotelList.add(new LocationModelClass("Hotel Shreyash Regency",R.drawable.shreyas));
        HotelList.add(new LocationModelClass("Hotel Atithi Palace",R.drawable.athithi));
        HotelList.add(new LocationModelClass("Hotel Sai International",R.drawable.sai));
        HotelList.add(new LocationModelClass("Hotel Metro Plaza",R.drawable.metro));
        HotelList.add(new LocationModelClass("Hotel Chinmayee Inn",R.drawable.chimanyee));
        HotelList.add(new LocationModelClass("Hotel Atithi Tower",R.drawable.atower));



        return view;
    }


}
