package com.example.areas_y_volumenes;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Triangulo extends AppCompatActivity {

    private EditText BaseTriangulo;
    private EditText AlturaTriangulo;
    private Button calcular;
    private TextView resultado;
    private TextView resultadoP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);

        BaseTriangulo = (EditText)findViewById(R.id.baseTriangulo);
        AlturaTriangulo = (EditText)findViewById(R.id.alturaTriangulo);
        resultado = (TextView) findViewById(R.id.resultadoTriangulo);
        resultadoP = (TextView) findViewById(R.id.resultadoTrianguloP);

        calcular = findViewById(R.id.calcularTriangulo);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String base = BaseTriangulo.getText().toString();
                String altura = AlturaTriangulo.getText().toString();

                double area;
                double perimetro;

                int numero1 = Integer.parseInt(base);
                int numero2 = Integer.parseInt(altura);

                area = (numero1 * numero2)/2;
                perimetro = 3 * numero1;

                String resul = String.valueOf(area);
                String resulP = String.valueOf(perimetro);

                resultado.setText("A: "+resul);
                resultadoP.setText("P: "+resulP);
            }
        });
    }
}