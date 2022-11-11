package com.example.areas_y_volumenes;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Piramide extends AppCompatActivity {

    private EditText basePiramide;
    private EditText alturaPiramide;
    private Button calcular;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piramide);

        basePiramide = (EditText)findViewById(R.id.basePiramide);
        alturaPiramide = (EditText)findViewById(R.id.alturaPiramide);
        resultado = (TextView)findViewById(R.id.resultadoPiramide);

        calcular = findViewById(R.id.calcularPiramide);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String alturaPir = alturaPiramide.getText().toString();
                String basePir = basePiramide.getText().toString();

                double volumen;
                double Abase;

                int numero1 = Integer.parseInt(alturaPir);
                int numero2 = Integer.parseInt(basePir);

                Abase = numero2 * numero2;

                volumen = (Abase * numero1)/3;

                String resul = String.valueOf(volumen);

                resultado.setText("V: "+ resul);
            }
        });
    }
}