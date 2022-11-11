package com.example.areas_y_volumenes;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Rectangulo extends AppCompatActivity {

    private EditText base;
    private EditText altura;
    private Button calcular;
    private TextView resultado;
    private TextView resultadoP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);

        base = (EditText)findViewById(R.id.baseRectangulo);
        altura = (EditText)findViewById(R.id.AlturaRectangulo);
        resultado = (TextView) findViewById(R.id.resultadoRectangulo);
        resultadoP = (TextView)findViewById(R.id.resultadoRectanguloP);

        calcular = findViewById(R.id.calcularRectangulo);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b = base.getText().toString();
                String a = altura.getText().toString();

                double area;
                double perimetro;

                int numero1 = Integer.parseInt(b);
                int numero2 = Integer.parseInt(a);

                area = numero1 * numero2;

                perimetro = (numero1*2) + (numero2*2);

                String resul = String.valueOf(area);
                String resulP = String.valueOf(perimetro);


                resultado.setText("A: "+resul);
                resultadoP.setText("P: "+resulP);
            }
        });
    }
}