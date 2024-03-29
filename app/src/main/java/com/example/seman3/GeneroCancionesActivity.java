package com.example.seman3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class GeneroCancionesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genero_canciones);

        ListView lstProductos = (ListView)findViewById(R.id.lstGeneros);

        int i = 0;
        String[] matriz = new String[6];
        matriz[i++] = "Pop";
        matriz[i++] = "Punk";
        matriz[i++] = "Música Clásica";
        matriz[i++] = "Opera";
        matriz[i++] = "Rock";
        matriz[i++] = "Salsa";

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(GeneroCancionesActivity.this,
                android.R.layout.simple_list_item_1,
                matriz);
        lstProductos.setAdapter(adaptador);

        lstProductos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Log.i("======>",""+position);
                startActivity(new Intent(getApplicationContext(),PeliculasListaActivity.class));
            }
        });

    }
}
