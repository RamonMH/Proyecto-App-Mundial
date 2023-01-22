package com.example.ramon.proyectomundial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ajustes extends AppCompatActivity {
    Button btnPartido, btnGrupos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajustes);
        setTitle("Ajustes");
        btnPartido = findViewById(R.id.partidos);
        btnGrupos = findViewById(R.id.grupos);
        View.OnClickListener evento = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId()==R.id.partidos)
                    activityPartido();
                if (v.getId()==R.id.grupos)
                    activityGrupos();
            }
        };
        btnPartido.setOnClickListener(evento);
        btnGrupos.setOnClickListener(evento);
    }
    public void activityPartido(){
        Intent intent = new Intent(Ajustes.this, RegistroPartidos.class);
        startActivity(intent);
    }
    public void activityGrupos(){
        Intent intent = new Intent(Ajustes.this, RegistroGrupos.class);
        startActivity(intent);
    }
}
