package com.example.areas_y_volumenes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private CardView cardView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cardView = findViewById(R.id.cardA);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent SiguienteA = new Intent( MainActivity.this, Areas.class);
                startActivity(SiguienteA);
            }
        });

        cardView = findViewById(R.id.cardV);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent SiguienteV = new Intent( MainActivity.this, Volumenes.class);
                startActivity(SiguienteV);
            }
        });
    }
}