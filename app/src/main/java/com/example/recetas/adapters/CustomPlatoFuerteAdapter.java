package com.example.recetas.adapters;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recetas.R;
import com.example.recetas.data.Platillos;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CustomPlatoFuerteAdapter extends RecyclerView.Adapter<CustomPlatoFuerteAdapter.ViewHolder> {
    private ArrayList<Platillos> mDataSet;
    private OnClicPlatosFuertesListener listener;
    public static SharedPreferences customShared;

   /* public static SharedPreferences getInstance() {
        if (customShared == null) {
            customShared = App.instance.getSharedPreferences(
                    App.instance.getString(R.string.preference_file_key), Context.MODE_PRIVATE);
        }
        return customShared;
    }

    public static void setSharedString(String key,String value){
        SharedPreferences sharedPref = getInstance();
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public static String getSharedString(String key){
        SharedPreferences sharedPref = getInstance();
        return sharedPref.getString(key, "");
    }*/




    public CustomPlatoFuerteAdapter(ArrayList<Platillos> dataSet, OnClicPlatosFuertesListener listener) {
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
        Platillos myPlatoFuerte = mDataSet.get(position);
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
        private Platillos platosFuertesList;
        private OnClicPlatosFuertesListener listener;

        public ViewHolder(View v) {
            super(v);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getListener().onPlatosFueetesClicListener(getPlatosFuertesList());
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

        public Platillos getPlatosFuertesList() {
            return platosFuertesList;
        }

        public void setPlatosFuertesList(Platillos platosFuertes) {
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
