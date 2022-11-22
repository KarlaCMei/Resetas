package com.example.recetas.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recetas.LoginActivity;
import com.example.recetas.MainActivity;
import com.example.recetas.R;
import com.example.recetas.data.PlatosFuertes;
import com.example.recetas.data.PlatosFuertesList;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CustomPlatoFuerteAdapter extends RecyclerView.Adapter<CustomPlatoFuerteAdapter.ViewHolder> {
    private ArrayList<PlatosFuertesList> mDataSet;
    private OnClicPlatosFuertesListener listener;

    public CustomPlatoFuerteAdapter(ArrayList<PlatosFuertesList> dataSet, OnClicPlatosFuertesListener listener) {
        mDataSet = dataSet;
        this.listener = listener;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Create a new view.
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.menu_item_list, parent, false);

       ViewHolder vh = new ViewHolder(v);
        vh.setListener(this.listener);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        PlatosFuertesList myPlatoFuerte = mDataSet.get(position);
        holder.setPlatosFuertesList(myPlatoFuerte);
        holder.getTextName().setText(myPlatoFuerte.getNombre());
        ImageView ivBasicImage =holder.getImgUrl();
        Picasso.with(ivBasicImage.getContext()).load(myPlatoFuerte.getUrlImg()).into(ivBasicImage);
    }
    @Override
    public int getItemCount() {
        return mDataSet.size();
    }

    /**
     * Provide a reference to the type of views that you are using (custom ViewHolder)
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textName;
        private final ImageView imgUrl;
        private PlatosFuertesList platosFuertesList;
        private OnClicPlatosFuertesListener listener;

        public ViewHolder(View v) {
            super(v);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getListener().onClicPlatosFuertesListener(getPlatosFuertesList());
                }
            });
            textName = v.findViewById(R.id.text_name);
            imgUrl = v.findViewById(R.id.img_hotel);
        }


        public TextView getTextName() {
            return textName;
        }


        public ImageView getImgUrl() {
            return imgUrl;
        }

        public PlatosFuertesList getPlatosFuertesList() {
            return platosFuertesList;
        }

        public void setPlatosFuertesList(PlatosFuertesList platosFuertes) {
            this.platosFuertesList = platosFuertes;
        }

        public OnClicPlatosFuertesListener getListener() {
            return listener;
        }

        public void setListener(OnClicPlatosFuertesListener listener) {
            this.listener = listener;
        }

    }
}
