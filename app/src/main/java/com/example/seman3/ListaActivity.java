package com.example.seman3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


public class ListaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        final String[] cursos = new String[] { "Sistemas distribuidos",    "Gerencia de proyectos", "Simulación de sistemas" };

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,    android.R.layout.simple_spinner_item, cursos);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner combo = (Spinner) findViewById(R.id.spinner);
        combo.setAdapter(adaptador);

        combo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, android.view.View v, int position, long id) {
                Toast.makeText(ListaActivity.this, "Seleccionado: " + cursos[position], Toast.LENGTH_LONG).show();
            }

            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(ListaActivity.this, "No ha seleccionado",    Toast.LENGTH_LONG).show();
            }
        });




    }
}
