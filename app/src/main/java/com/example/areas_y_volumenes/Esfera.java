package com.example.areas_y_volumenes;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Esfera extends AppCompatActivity {

    private EditText diametroEsfera;
    private Button calcular;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfera);

        diametroEsfera= (EditText)findViewById(R.id.diametroEsfera);
        resultado = (TextView) findViewById(R.id.resultadoEsfera);

        calcular = findViewById(R.id.calcularEsfera);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String diametro = diametroEsfera.getText().toString();
                double radio;
                double volumen;

                double r3;
                double v1;


                int numero1 = Integer.parseInt(diametro);

                radio = numero1 / 2;

                r3 = Math.pow(radio,3);
                v1 = r3 * 4;
                volumen = (v1 * Math.PI)/3;

                String resul = String.valueOf(volumen);

                resultado.setText("V: " + resul);
            }
        });
    }
}