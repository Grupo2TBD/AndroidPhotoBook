package com.ejemplo.ignacio.ejemplo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.util.Log;


public class Activity2 extends ActionBarActivity {
    private static final String TAG = "activity2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
        View iniciarSesion = findViewById(R.id.buttonIniciarSesion);
            iniciarSesion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String txtUsuario, txtPass;

                    EditText usuario = (EditText) findViewById(R.id.input1);

                    EditText pass = (EditText) findViewById(R.id.input2);

                    txtUsuario = usuario.getText().toString();

                    txtPass = pass.getText().toString();

                    Log.v(TAG, "txtUsuario: " +txtUsuario);

                    if ((txtUsuario.equals("")) || (txtPass.equals(""))){

                        String txtToast;
                        int duracion;
                        txtToast = "Rellene ambos campos";
                        duracion = Toast.LENGTH_SHORT;
                        Toast.makeText(v.getContext(), txtToast, duracion).show();
                    }
                    else{
                        Intent intent = new Intent(v.getContext(), Home.class);
                        intent.putExtra(Home.nombre, txtUsuario);
                        startActivity(intent);
                        }

                }

            });
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
