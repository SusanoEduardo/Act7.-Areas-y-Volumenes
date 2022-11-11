package com.example.areas_y_volumenes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Volumenes extends AppCompatActivity {

    List<ListaElementosVolumenes> elementos;
    private RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_volumenes);

        init();
        recycler = findViewById(R.id.recyclerView_volumenes);

        int orientation = this.getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            recycler.setLayoutManager(new GridLayoutManager(this, 1));
        } else {
            recycler.setLayoutManager(new GridLayoutManager(this, 3));
        }

    }

    public void init(){
        elementos = new ArrayList<>();
        elementos.add(new ListaElementosVolumenes(R.drawable.vcubo, "Cubo",""));
        elementos.add(new ListaElementosVolumenes(R.drawable.vcilindro, "Cilindro",""));
        elementos.add(new ListaElementosVolumenes(R.drawable.vesfera, "Esfera",""));
        elementos.add(new ListaElementosVolumenes(R.drawable.vpiramide_pentagono, "Piramide",""));
        elementos.add(new ListaElementosVolumenes(R.drawable.vprima_pentagono_jpg, "Prisma",""));


        AdaptadorVolumen listAdapter = new AdaptadorVolumen(elementos, this, new AdaptadorVolumen.OnItemClickListener() {
            @Override
            public void OnItemClick(ListaElementosVolumenes item) {
                moveToDescription(item);
            }
        });

        RecyclerView recyclerView = findViewById(R.id.recyclerView_volumenes);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }
    public void moveToDescription(ListaElementosVolumenes item){
        Intent intent = new Intent(this, Cubo.class);
        //intent.putExtra("ListElement", item);
        startActivity(intent);
    }
}