package com.ejemplo.ignacio.ejemplo;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import org.json.JSONArray;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;


public class BusquedaDeFotos extends ActionBarActivity {

    private EditText inputFoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda_de_fotos);
        inputFoto = (EditText) findViewById(R.id.input_fotografia);

    }
    /*public void buscarFoto(View view){
        String titulo = inputFoto.getText().toString();
        if (!TextUtils.isEmpty(titulo)){

        }
    }

    public static final String TAG = "com.ejemplo.ignacio.ejemplo";

    private class CargarFotoTask extends AsyncTask<String, Long, String>{
        protected String doInBackground(String... urls){
            try {
                return HttpRequest.get(urls[0]).accept("application/json").body();
            }catch(HttpException exception){
                return null;
            }
        }
    protected void onPostExcecute(String reponse){
        Log.i(TAG, reponse);
    }
    }
*/


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_busqueda_de_fotos, menu);
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
