package com.example.areas_y_volumenes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Circulo extends AppCompatActivity {

    private EditText diametro;
    private Button calcular;
    private TextView resultado;
    private TextView resultadoP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);

        diametro= (EditText)findViewById(R.id.diametroCirculo);
        resultado = (TextView) findViewById(R.id.resultadoCirculo);
        resultadoP = (TextView)findViewById(R.id.resultadoCirculoP);

        calcular = findViewById(R.id.calcularCirculo);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valor1 = diametro.getText().toString();
                double radio;
                double area;
                double perimetro;

                int numero1 = Integer.parseInt(valor1);

                radio = (numero1 / 2);

                area = Math.PI * Math.pow(radio,2);

                perimetro = Math.PI * numero1;

                String resul = String.valueOf(area);
                String resulA = String.valueOf(perimetro);



                resultado.setText("A " +resul);
                resultadoP.setText("P " + resulA);

            }
        });
    }
}