package com.jhon.localizatuhospital;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class AdaptadorLocalidad extends RecyclerView.Adapter<AdaptadorLocalidad.LocalidadViewHolder> implements View.OnClickListener{
    ArrayList<String> Localidades;
    Activity activity;
    private View.OnClickListener listener;
    public AdaptadorLocalidad(ArrayList<String> Localidades) {
        this.Localidades = Localidades;
    }


    @NonNull
    @Override
    public LocalidadViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_dato,parent,false);
        v.setOnClickListener(this);
        return new LocalidadViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull LocalidadViewHolder holder, int position) {
        holder.asignardatos(Localidades.get(position));

    }

    @Override
    public int getItemCount() {
        return Localidades.size();
    }

    @Override
    public void onClick(View v) {
        if (listener != null) { listener.onClick(v);}
    }
    public void setOnClickListener (View.OnClickListener listener){
        this.listener = listener;
    }
    public class LocalidadViewHolder extends RecyclerView.ViewHolder {
       ImageView imageView;
       TextView name;
        public LocalidadViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            name= itemView.findViewById(R.id.name);
        }

        public void asignardatos(String s) {
            name.setText(s);
        }
    }


}
