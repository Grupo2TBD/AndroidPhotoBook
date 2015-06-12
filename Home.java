package com.ejemplo.ignacio.ejemplo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static android.view.View.OnClickListener;


public class Home extends ActionBarActivity implements OnClickListener {
    int[] fotoID = {
            R.drawable.buho_calavera,
            R.drawable.skate,
            R.drawable.perrito
    };
    int i = 0;
    int total;
    ImageView imagen;
    public static final String nombre = "Usuario"; //creo esta varible para poder pasar el valor de una activity a otra
    //runOnUIDthread;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView is = (TextView) findViewById(R.id.textView4); //creo el cuadro para mostrar el texto posteriormente
        String nombreUsuario = getIntent().getStringExtra("Usuario"); //obtengo el valor ingresado en la activity anterior
        //Toast.makeText(is.getContext(), "¡Bienvenido " + nombreUsuario + "!\n", Toast.LENGTH_LONG);
        imagen = (ImageView) findViewById(R.id.imagenGaleria);
        is.setText("¡Bienvenido " + nombreUsuario + "!\n"); //muestro el texto
        Button BotonSiguiente = (Button) findViewById(R.id.BotonSiguiente);
        Button BotonAnterior = (Button) findViewById(R.id.BotonAnterior);
        Button BotonBuscar = (Button) findViewById(R.id.BotonBuscar);
        BotonAnterior.setOnClickListener(this);
        BotonSiguiente.setOnClickListener(this);
        total = fotoID.length;
        BotonBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), BusquedaDeFotos.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onClick(View v){
        int id = v.getId();
        if (id==R.id.BotonSiguiente){
            i++;
            if (i==total) i=0;
        }
        if (id==R.id.BotonAnterior){
            i--;
            if (i==-1) i=total-1;
        }
        imagen.setImageResource(fotoID[i]);
        //nombreFoto.setText(txt[i]);
        /*if (id == R.id.BotonBuscar){
            Intent intent = new Intent(v.getContext(), BusquedaDeFotos.class);
            startActivity(intent);
        }*/
    }

}