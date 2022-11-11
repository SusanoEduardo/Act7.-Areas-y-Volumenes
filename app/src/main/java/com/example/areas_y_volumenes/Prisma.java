package com.example.areas_y_volumenes;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Prisma extends AppCompatActivity {

    private EditText basePrisma;
    private EditText alturaPrisma;
    private EditText apotemaPrisma;
    private Button calcular;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prisma);

        basePrisma = (EditText)findViewById(R.id.basePrisma);
        alturaPrisma = (EditText)findViewById(R.id.alturaPrisma);
        apotemaPrisma = (EditText)findViewById(R.id.apotemaPrisma);
        resultado = (TextView)findViewById(R.id.resultadoPrisma);

        calcular = findViewById(R.id.calcularPrisma);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String alturaPri = alturaPrisma.getText().toString();
                String basePri = basePrisma.getText().toString();
                String apotemaPri = apotemaPrisma.getText().toString();

                double perimetro;
                double volumen;
                double Abase;

                int numero1 = Integer.parseInt(alturaPri);
                int numero2 = Integer.parseInt(basePri);
                int numero3 = Integer.parseInt(apotemaPri);

                perimetro = numero2 * 5;

                Abase = (perimetro * numero3)/2;

                volumen = Abase * numero1;

                String resul = String.valueOf(volumen);

                resultado.setText("V: "+ resul);
            }
        });
    }
}