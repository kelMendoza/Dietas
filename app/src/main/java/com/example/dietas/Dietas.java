package com.example.dietas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Dietas extends AppCompatActivity {

    String dieta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietas);
        String dieta = getIntent().getStringExtra("dieta");
    }

    public void dieta1(View view) {
        Intent intent = new Intent(Dietas.this, Descripcion.class);
        dieta="dieta1";
        intent.putExtra("dieta",dieta);
        startActivity(intent);
    }
    public void dieta2(View view) {
        Intent intent = new Intent(Dietas.this, Descripcion.class);
        dieta="dieta2";
        intent.putExtra("dieta",dieta);
        startActivity(intent);
    }
    public void dieta3(View view) {
        Intent intent = new Intent(Dietas.this, Descripcion.class);
        dieta="dieta3";
        intent.putExtra("dieta",dieta);
        startActivity(intent);
    }
    public void dieta4(View view) {
        Intent intent = new Intent(Dietas.this, Descripcion.class);
        dieta="dieta4";
        intent.putExtra("dieta",dieta);
        startActivity(intent);
    }
    public void dieta5(View view) {
        Intent intent = new Intent(Dietas.this, Descripcion.class);
        dieta="dieta5";
        intent.putExtra("dieta",dieta);
        startActivity(intent);
    }
    public void dieta6(View view) {
        Intent intent = new Intent(Dietas.this, Descripcion.class);
        dieta="dieta6";
        intent.putExtra("dieta",dieta);
        startActivity(intent);
    }


    public void Seleccion(View view){
        switch (view.getId()){
            case R.id.dieta1:
                Toast.makeText(Dietas.this, "Dieta de la clínica Mayo",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.dieta2:
                Toast.makeText(Dietas.this, "Dieta mediterránea",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.dieta3:
                Toast.makeText(Dietas.this, "Dieta DASH",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.dieta4:
                Toast.makeText(Dietas.this, "Dieta flexitariana",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.dieta5:
                Toast.makeText(Dietas.this, "Dieta Power",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.dieta6:
                Toast.makeText(Dietas.this, "Dieta TLC",
                        Toast.LENGTH_SHORT).show();
                break;
        }
    }
}