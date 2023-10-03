package com.databit.semana7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        final Button BTAceptar =(Button) findViewById(R.id.BTAceptar);
        BTAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText ETNombre=(EditText) findViewById(R.id.ETNombreFoto);
                String StNombre= ETNombre.getText().toString();
                Intent sIntent = new Intent(Inicio.this, AResultado.class);
                sIntent.putExtra("STNombre", StNombre);
                startActivity(sIntent);

            }
        });
    }

}