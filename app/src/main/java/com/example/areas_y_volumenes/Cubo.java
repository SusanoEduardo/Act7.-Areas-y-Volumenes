package com.example.areas_y_volumenes;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cubo extends AppCompatActivity {

    private EditText Borde;
    private Button calcular;
    private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubo);


        Borde = (EditText)findViewById(R.id.bordeCubo);
        resultado = (TextView) findViewById(R.id.resultadoCubo);

        calcular = findViewById(R.id.calcularCubo);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String borde = Borde.getText().toString();

                double volumen;

                int numero1 = Integer.parseInt(borde);

                volumen = (numero1 * numero1) * numero1;

                String resul = String.valueOf(volumen);

                resultado.setText("V: "+ resul);
            }
        });
    }
}