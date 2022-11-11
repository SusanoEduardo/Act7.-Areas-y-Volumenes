package com.example.areas_y_volumenes;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Rombo extends AppCompatActivity {
    private EditText diagonalA;
    private EditText diagonalB;
    private EditText lado1;
    private Button calcular;
    private TextView resultado;
    private TextView resultadoP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rombo);

        diagonalA = (EditText)findViewById(R.id.diagonalARombo);
        diagonalB = (EditText)findViewById(R.id.diagonalBRombo);
        lado1 = (EditText)findViewById(R.id.LadoRombo);

        resultado = (TextView) findViewById(R.id.resultadoRombo);
        resultadoP = (TextView)findViewById(R.id.resultadoRomboP);

        calcular = findViewById(R.id.calcularRombo);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String DA = diagonalA.getText().toString();
                String DB = diagonalB.getText().toString();
                String la = lado1.getText().toString();

                double area;
                double perimetro;

                int numero1 = Integer.parseInt(DA);
                int numero2 = Integer.parseInt(DB);
                int lado = Integer.parseInt(la);

                area = (numero1 * numero2)/2;
                perimetro = 4 * lado;

                String resulP = String.valueOf(perimetro);
                String resul = String.valueOf(area);

                resultado.setText("A: "+resul);
                resultadoP.setText("P: "+resulP);
            }
        });
    }
}