package com.databit.semana7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AResultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aresultado);

        // Recupera la cadena de texto del intent
        String nombre = getIntent().getStringExtra("STNombre");

        // Encuentra el TextView por su ID
        TextView resultado = findViewById(R.id.resultado);

        // Establece el texto del TextView
        resultado.setText(nombre);
    }
}
