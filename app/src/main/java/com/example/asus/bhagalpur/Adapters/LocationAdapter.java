package com.example.asus.bhagalpur.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.asus.bhagalpur.LocationModelClass;
import com.example.asus.bhagalpur.R;

import java.util.List;

public class LocationAdapter extends RecyclerView.Adapter<LocationAdapter.ViewHolder> {

    List<LocationModelClass> listItem;
    Context context;
    public LocationAdapter(List<LocationModelClass> listItem, Context context) {
        this.listItem=listItem;
        this.context=context;
    }

    @NonNull
    @Override
    public LocationAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.loacation_card, parent, false);
        return new LocationAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LocationAdapter.ViewHolder holder, int position) {
        final LocationModelClass list = listItem.get(position);
        holder.lName.setText("  "+list.getName());
        //Glide for inflating images
        Glide.with(context).load(list.getImage()).into(holder.lImage);
        //holder.lImage.setImageResource(list.getImage());
    }

    @Override
    public int getItemCount() {
        return listItem.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {

        //Declaration of Views
        public TextView lName;
        public ImageView lImage;

        public ViewHolder(View itemView) {
            super(itemView);
            lImage=itemView.findViewById(R.id.locationImage);
            lName=itemView.findViewById(R.id.locationName);
            //findViewByid
        }
    }
}
