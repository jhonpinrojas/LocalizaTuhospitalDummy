package com.jhon.localizatuhospital.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jhon.localizatuhospital.AdaptadorLocalidad;
import com.jhon.localizatuhospital.Epsespecifica;
import com.jhon.localizatuhospital.Localidadespecifica;
import com.jhon.localizatuhospital.R;
import java.util.ArrayList;


public class EpsFragment extends Fragment {
    private RecyclerView ListaEps;
    ArrayList<String> Eps;
//    private IRecyclerViewPresentador presenter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_eps,container,false);
        ListaEps = v.findViewById(R.id.Listaeps);
     //   presenter = new FavoritaPresentador(this,getContext());
        generarLinearLayout();
        inicializardatos();
        inicializarAdaptador ();
        return v;

    }


    public void generarLinearLayout() {
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        ListaEps.setLayoutManager(llm);
    }


    public void inicializardatos() {
        Eps = new ArrayList<String>();
        Eps.add("NUEVA EPS"); Eps.add("SALUD TOTAL EPS"); Eps.add("EPS SANITAS"); Eps.add("COMPENSAR EPS");
        Eps.add("COMFENALCO"); Eps.add("ALIANSALUD"); Eps.add("SALUDCOOP");
        Eps.add("AXA COLPATRIA"); Eps.add("COOMEVA EPS");Eps.add("CAPITAL SALUD EPS");
        Eps.add("CONVIDA-EPS");Eps.add("EPS FAMISANAR"); Eps.add("COOSALUD");
             Eps.add("COLSANITAS EPS"); Eps.add("ASMET SALUD");  Eps.add("AMBUQ"); Eps.add("MUTUALSER");
         Eps.add("MEDIMAS"); Eps.add("SERVICIO OCCIDENTAL DE SALUD");
    }
    public AdaptadorLocalidad adaptador2;
    public void inicializarAdaptador (){
        //asigan a contacto adaptador a la lista contactos
        adaptador2 = new AdaptadorLocalidad(Eps);
        ListaEps.setAdapter(adaptador2);
        adaptador2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getContext(), Epsespecifica.class);
                int i = ListaEps.getChildAdapterPosition(v);
                String j = Eps.get(i);
                intent2.putExtra("eps",j);
                startActivity(intent2);
            }
        });

    }



}