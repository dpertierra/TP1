package com.example.a42025177.tp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ActividadPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_principal);
    }
    public void PresionaBoton(View Vista)
    {
        TextView Label;
        TextView Label2;
        TextView Label3;
        TextView Label4;
        Label4 = (TextView) findViewById(R.id.TVmostrar4);
        Label3 = (TextView) findViewById(R.id.TVmostrar3);
        Label2 = (TextView) findViewById(R.id.TVmostrar2);
        Label = (TextView) findViewById(R.id.TVmostrar);
        EditText Texto1;
        String Texto1String;
        String Texto2String;
        String textounido;
        Texto1 = (EditText)findViewById(R.id.Textoing1);
        Texto1String = Texto1.getText().toString();
        EditText Texto2;
        Texto2 = (EditText)findViewById(R.id.Textoing2);
        EditText letrasconca;
        String letrasaunir;
        int nletrasaconcatenar;
        letrasconca = (EditText)findViewById(R.id.letrasconca);
        letrasaunir = letrasconca.getText().toString();
        nletrasaconcatenar = Integer.parseInt(letrasaunir);
        Texto2String = Texto2.getText().toString();

        int mascarac = 0;

        if (Texto1String.length() == 0 || Texto2String.length() == 0) //Valida que el usuario haya ingresado texto en ambos espacios
        {

            Label.setText("Debe ingresar al menos 1 (una) palabra en ambos cuadros de texto");
        }
        else //cuenta las letras, las palabras de ambos textos
        {
            String[] palabrasTexto1;
            String[] palabrasTexto2;
            Texto1String = Texto1String.trim();
            Texto2String = Texto2String.trim();
            palabrasTexto1 = Texto1String.split(" ");
            palabrasTexto2 = Texto2String.split(" ");
            Label.setText("El largo del texto 1 es de  " + Texto1String.length() + " caracteres y tiene " + palabrasTexto1.length + " palabras");
            Label2.setText("El largo del texto 2 es de " + Texto2String.length() + " caracteres y tiene " + palabrasTexto2.length + " palabras");

            if (Texto1String.length() > Texto2String.length()) //Se fija si el texto 1 tiene mas letras que el texto 2
            {
                mascarac = Texto1String.length() - Texto2String.length();
                Label3.setText("El texto 1 tiene " + mascarac + " mas que el texto 2");

            }
            else if (Texto1String.length() < Texto2String.length()) //Se fija si el texto 2 tiene mas letras que el texto 1
            {
                mascarac = Texto2String.length() - Texto1String.length();
                Label3.setText("El texto 2 tiene " + mascarac + " mas que el texto 1");

            }
            else //muestra que ambos textos tienen la misma cantidad de caracteres
            {
                Label3.setText("Ambos textos tienen la misma cantidad de caracteres");
            }
            if (letrasconca.length() == 0) //se fija que el usuario haya elegido cuantas letras quiere concatenar
            {
                Label4.setText("Debe ingresar cuantas letras desea unir");
            }
            else if (Texto1String.length()>nletrasaconcatenar && Texto2String.length()> nletrasaconcatenar) //Se fija si el texto 1 y el 2 tienen mas letras que la cantidad que se eligio para concatenar
            {
                textounido = Texto1String.substring(0,nletrasaconcatenar) + Texto2String.substring(0,nletrasaconcatenar);
                Label4.setText("El texto que se formó es: " + textounido);
            }
            else
            {
                Label4.setText("Alguno de los textos no tiene la cantidad de letras necesarias para poder concatenarlo");
            }

        }


        }
    public void BotonVolveralInicio(View Vista)
    {
        Intent Ir;
        Ir = new Intent(ActividadPrincipal.this, Menu.class);
        startActivity(Ir);
    }

    }

