package com.example.a42025177.tp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Punto2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punto2);
    }
    public void PresionaBoton (View vista) {
        CheckBox menosde10letras;
        int contrepe = 0;
        menosde10letras = (CheckBox) findViewById(R.id.menosde10letras);
        TextView Label;
        TextView Label2;
        char repetida;
        EditText letrarepe;
        letrarepe = (EditText) findViewById(R.id.letrarepetida);
        repetida = letrarepe.getText().charAt(0);
        Label2 = (TextView) findViewById(R.id.TVmostrar2);
        Label = (TextView) findViewById(R.id.TVmostrar);
        EditText Texto1;
        String Texto1String;
        String Textoverificaporminomay;
        Texto1 = (EditText)findViewById(R.id.Textoing1);
        Texto1String = Texto1.getText().toString();
        Textoverificaporminomay = Texto1String.toLowerCase();
        if (Texto1String.length()==0) //Verifica que el usuario haya ingresado texto
        {
            Label.setText("Debe ingresar un texto");
        }
        else
        {
            if (menosde10letras.isChecked()== true) {
                if (Texto1String.length() <= 10) {
                    for (int i = 0; i < Texto1String.length(); i++) {
                        if (Texto1String.charAt(i) == repetida || Textoverificaporminomay.charAt(i) == repetida)
                        {
                            contrepe++; //Cuenta la cantidad de veces que una letra esta repetida
                        }

                    }
                    Label.setText("El texto tiene " + contrepe + " " + repetida);
                }
                else
                {
                    Label.setText("Si el checkbox esta tildado el texto ingresado no puede tener mas de 10 letras");
                }
            }
            else
            {

            for( int i=0; i<Texto1String.length(); i++ )
            {
                if( Texto1String.charAt(i) == repetida || Textoverificaporminomay.charAt(i) == repetida)
                {
                    contrepe++; //Cuenta la cantidad de veces que una letra esta repetida
                }

            }
                Label.setText("El texto tiene " + contrepe + " " + repetida);

        }


    }
}
    public void BotonVolveralInicio(View Vista)
    {
        Intent Ir;
        Ir = new Intent(Punto2.this, Menu.class);
        startActivity(Ir);
    }
}
