package com.example.a42025177.tp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Punto3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punto3);
    }
    public void PresionaBoton (View Vista) {
        TextView Label;
        Label = (TextView) findViewById(R.id.TVmostrar);
        TextView Label2;
        Label2 = (TextView) findViewById(R.id.TVmostrar2);
        EditText Texto1;
        String Texto1String;
        String alreves = "";
        Texto1 = (EditText) findViewById(R.id.Textoing1);
        Texto1String = Texto1.getText().toString();
        if (Texto1String.length() == 0) {
            Label.setText("Debe ingresar un texto");
        } else {
            for (int i = Texto1String.length() - 1; i >= 0; i--) { //Da vuelta el texto
                alreves = alreves + Texto1String.charAt(i);
            }
            if (Texto1String.compareTo(alreves.toString())==0) //Se fija si el texto es capicua
            {
                Label2.setText("El texto es capicua");
            }
            Label.setText("El texto al reves es: " + alreves); //Muestra el texto al reves
        }
    }
        public void BotonVolveralInicio (View Vista)
        {
            Intent Ir;
            Ir = new Intent(Punto3.this, Menu.class);
            startActivity(Ir);
        }}