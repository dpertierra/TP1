package com.example.a42025177.tp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Punto4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punto4);
    }
    public void PresionaBoton(View Vista)
    {
        String ultimapalabra;
        TextView Label;
        Label = (TextView) findViewById(R.id.TVmostrar);
        EditText Texto1;
        String Texto1String;
        Texto1 = (EditText)findViewById(R.id.Textoing1);
        Texto1String = Texto1.getText().toString();
        String[] palabrasTexto1;
        Texto1String = Texto1String.trim();
        palabrasTexto1 = Texto1String.split(" ");
        if (Texto1String.length()== 0)
        {
            Label.setText("Debe ingresar texto");

        }
        else if(palabrasTexto1.length>= 2) //Se fija que el texto ingresado tenga 2 palabras o mas
        {

            ultimapalabra = Texto1String.substring(Texto1String.lastIndexOf(" ")+1);
            Label.setText("La ultima palabra es: " + ultimapalabra); // Muestra cual es la ultima palabra del texto
        }
        else
        {
            Label.setText("Debe ingresar 2 palabras o mas");
        }
    }
    public void BotonVolveralInicio(View Vista)
    {
        Intent Ir;
        Ir = new Intent(Punto4.this, Menu.class);
        startActivity(Ir);
    }
}

