package com.example.asus.bhagalpur.Fragments;

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


public class PlacesFragment extends Fragment {


    List<LocationModelClass> PlacesList = new ArrayList<>();
    RecyclerView recyclerView2;
    LocationAdapter PlacesAdapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_places, container, false);

        recyclerView2 = view.findViewById(R.id.recyclerViewPlaces);
        PlacesAdapter =new LocationAdapter(PlacesList,getContext());
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView2.setAdapter(PlacesAdapter);

        PlacesList.add(new LocationModelClass("Mandar Hills",R.drawable.mandar));
        PlacesList.add(new LocationModelClass("Kuppa Ghat",R.drawable.kuppa));
        PlacesList.add(new LocationModelClass("Ruins of Vikramshila",R.drawable.vikramshila));
        PlacesList.add(new LocationModelClass("Ghanta Ghar",R.drawable.ghanta2));
        PlacesList.add(new LocationModelClass("Jay Prakash Udyan",R.drawable.jay));
        PlacesList.add(new LocationModelClass("Lala Lajpat Ray Udyan",R.drawable.lajpat));
        PlacesList.add(new LocationModelClass("Vikramshila Setu",R.drawable.bridge));
        PlacesList.add(new LocationModelClass("N.T.P.C",R.drawable.ntpc));
        PlacesList.add(new LocationModelClass("Town Hall",R.drawable.hall));




        return view;
    }


}
