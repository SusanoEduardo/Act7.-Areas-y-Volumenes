package com.example.areas_y_volumenes;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cilindro extends AppCompatActivity {

    private EditText AlturaCilindro;
    private EditText radioCilindro;
    private Button calcular;
    private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cilindro);

        AlturaCilindro = (EditText)findViewById(R.id.alturaCilindro);
        radioCilindro = (EditText)findViewById(R.id.radioCilindro);
        resultado = (TextView)findViewById(R.id.resultadoCilindro);

        calcular = findViewById(R.id.calcularCilindro);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String alturaCi = AlturaCilindro.getText().toString();
                String radioCi = radioCilindro.getText().toString();

                double volumen;

                int numero1 = Integer.parseInt(alturaCi);
                int numero2 = Integer.parseInt(radioCi);

                volumen = 3.14 * (numero2 * numero2)*(numero1);

                String resul = String.valueOf(volumen);

                resultado.setText("V: "+ resul);
            }
        });
    }
}