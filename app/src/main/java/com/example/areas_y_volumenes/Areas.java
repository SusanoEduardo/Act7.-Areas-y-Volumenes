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

public class Areas extends AppCompatActivity {

    List<ListaElementosAreas> elementos;
    private RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_areas);

        init();
        recycler = findViewById(R.id.recyclerView_areas);

        int orientation = this.getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            recycler.setLayoutManager(new GridLayoutManager(this, 1));
        } else {
            recycler.setLayoutManager(new GridLayoutManager(this, 3));
        }
    }

    public void init(){
        elementos = new ArrayList<>();
        elementos.add(new ListaElementosAreas(R.drawable.acirculo, "Círculo",""));
        elementos.add(new ListaElementosAreas(R.drawable.arombo, "Rombo",""));
        elementos.add(new ListaElementosAreas(R.drawable.atriangulo, "Triangulo",""));
        elementos.add(new ListaElementosAreas(R.drawable.arectangulo, "Rectangulo",""));
        elementos.add(new ListaElementosAreas(R.drawable.apentagono, "Pentagono",""));


        AdaptadorArea listAdapter = new AdaptadorArea(elementos, this, new AdaptadorArea.OnItemClickListener() {
            @Override
            public void OnItemClick(ListaElementosAreas item) {
                moveToDescription(item);
            }
        });

        RecyclerView recyclerView = findViewById(R.id.recyclerView_areas);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }
    public void moveToDescription(ListaElementosAreas item){
        Intent intent = new Intent(this, Circulo.class);
        //intent.putExtra("ListElement", item);
        startActivity(intent);
    }
}