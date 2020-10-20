package com.jhon.localizatuhospital.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.jhon.localizatuhospital.AdaptadorLocalidad;
import com.jhon.localizatuhospital.Localidad;
import com.jhon.localizatuhospital.Localidadespecifica;
import com.jhon.localizatuhospital.R;

import java.util.ArrayList;


public class FragmentReciclerview extends Fragment {
    private RecyclerView Listalocalidades;
    ArrayList<String>Localidades;
 //   private IRecyclerViewPresentador presenter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_reciclerview,container,false);
        Listalocalidades = v.findViewById(R.id.Listalocalidades);
        generarLinearLayout();
        inicializardatos();
        inicializarAdaptador ();
        //      presenter= new RecyclerViewPresentador(this,getContext());
        return v;

    }


    public void generarLinearLayout() {
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        Listalocalidades.setLayoutManager(llm);
        //   GridLayoutManager glm = new GridLayoutManager(this ,2 );
    }

    public void inicializardatos() {
        Localidades = new ArrayList<String>();
        Localidades.add("USAQUÉN"); Localidades.add("CHAPINERO"); Localidades.add("ENGATIVA");
        Localidades.add("SUBA"); Localidades.add("SANTA FE"); Localidades.add("SAN CRISTÓBAL");
        Localidades.add("FONTIBÓN"); Localidades.add("BARRIOS UNIDOS"); Localidades.add("USME");
        Localidades.add("TUNJUELITO"); Localidades.add("BOSA"); Localidades.add("KENNEDY");
        Localidades.add("TEUSAQUILLO"); Localidades.add("LOS MÁRTIRES"); Localidades.add("ANTONIO NARIÑO");
        Localidades.add("PUENTE ARANDA"); Localidades.add("LA CANDELARIA"); Localidades.add("RAFAEL URIBE URIBE");
        Localidades.add("CIUDAD BOLÍVAR"); Localidades.add("SUMAPAZ");

    }
    public AdaptadorLocalidad adaptador;
    public void inicializarAdaptador (){
        //asigan a contacto adaptador a la lista contactos
        adaptador = new AdaptadorLocalidad(Localidades);
        adaptador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent intent1 = new Intent(getContext(), Localidadespecifica.class);
             int i = Listalocalidades.getChildAdapterPosition(v);
             String j = Localidades.get(i);
             intent1.putExtra("localidad",j);
             startActivity(intent1);
            }
        });
        Listalocalidades.setAdapter(adaptador);

    }
}


