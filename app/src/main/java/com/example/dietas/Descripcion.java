package com.example.dietas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Descripcion extends AppCompatActivity {

    TextView titulo;
    ListView contenido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion);
        String dieta = getIntent().getStringExtra("dieta");

        titulo = findViewById(R.id.textViewTitulo);
        contenido = findViewById(R.id.listViewContenido);

        if (dieta.equals("dieta1")){
            titulo.setText("Dieta de la clínica Mayo");
            contenido.setAdapter(ArrayAdapter.createFromResource(this,R.array.dieta1,
                    android.R.layout.simple_list_item_1));
        }else if (dieta.equals("dieta2")){
            titulo.setText("Dieta mediterránea");
            contenido.setAdapter(ArrayAdapter.createFromResource(this,R.array.dieta2,
                    android.R.layout.simple_list_item_1));
        }else if (dieta.equals("dieta3")){
            titulo.setText("Dieta DASH");
            contenido.setAdapter(ArrayAdapter.createFromResource(this,R.array.dieta3,
                    android.R.layout.simple_list_item_1));
        }else if (dieta.equals("dieta4")){
            titulo.setText("Dieta flexitariana");
            contenido.setAdapter(ArrayAdapter.createFromResource(this,R.array.dieta4,
                    android.R.layout.simple_list_item_1));
        }else if (dieta.equals("dieta5")){
            titulo.setText("Dieta Power");
            contenido.setAdapter(ArrayAdapter.createFromResource(this,R.array.dieta5,
                    android.R.layout.simple_list_item_1));
        }else if (dieta.equals("dieta6")){
            titulo.setText("Dieta TLC");
            contenido.setAdapter(ArrayAdapter.createFromResource(this,R.array.dieta6,
                    android.R.layout.simple_list_item_1));
        }
    }


}