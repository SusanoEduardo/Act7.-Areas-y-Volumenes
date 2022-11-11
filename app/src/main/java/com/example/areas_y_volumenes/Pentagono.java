package com.example.areas_y_volumenes;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Pentagono extends AppCompatActivity {

    private EditText lado1dePenta;
    private EditText Apotema;
    private Button calcular;
    private TextView resultado;
    private TextView resultadoP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pentagono);

        lado1dePenta = (EditText)findViewById(R.id.lado1DePen);
        Apotema = (EditText)findViewById(R.id.apotema);
        resultado = (TextView) findViewById(R.id.resultadoPentagono);
        resultadoP = (TextView)findViewById(R.id.resultadoPentagonoP);

        calcular = findViewById(R.id.calcularPentagono);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lado1 = lado1dePenta.getText().toString();
                String Apotema2 = Apotema.getText().toString();

                double area;
                double perimetro;

                double numero1 = Double.parseDouble(lado1);
                double numero2 = Double.parseDouble(Apotema2);

                perimetro = numero1 * 5;

                area = (perimetro * numero2)/2;

                String resul = String.valueOf(area);
                String resulP = String.valueOf(perimetro);


                resultado.setText("A: "+ resul);
                resultadoP.setText("P: "+ resulP);
            }
        });
    }
}