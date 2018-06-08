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


public class TempleFragment extends Fragment {
    List<LocationModelClass> templeList = new ArrayList<>();
    RecyclerView recyclerView;
    LocationAdapter templeAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_temple, container, false);
        recyclerView = view.findViewById(R.id.recyclerViewTemple);
        templeAdapter =new LocationAdapter(templeList,getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(templeAdapter);


        templeList.add(new LocationModelClass("BurhaNath Temple",R.drawable.burhanath));
        templeList.add(new LocationModelClass("Digambar Jain Mandir",R.drawable.digambar));
        templeList.add(new LocationModelClass("Ajgabinath Mandir",R.drawable.ajgabinath));
        templeList.add(new LocationModelClass("Ghuran Peer Baba",R.drawable.ghuran));
        templeList.add(new LocationModelClass("Catholic Church",R.drawable.chruch));





        return view;
    }
}
