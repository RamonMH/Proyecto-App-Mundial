package com.example.ramon.proyectomundial;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Grupos extends AppCompatActivity {
    ListView lst;
    ArrayList <String> Lista;

    ArrayAdapter adapter;
    AyudaBDDos conn;

    private BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupos);
        setTitle("Grupos");
        lst=findViewById(R.id.listGrupos);

        AyudaBDDos conn = new AyudaBDDos(getApplicationContext());
        Lista = conn.llenar();
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,Lista);
        lst.setAdapter(adapter);
        //consultarLista();

        bottomNavigationView=(BottomNavigationView) findViewById(R.id.bottomNavigationView);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_noticias:
                        setTitle("Noticias");
                        Intent noti = new Intent(Grupos.this, MainActivity.class);
                        startActivity(noti);
                        break;

                    case R.id.nav_partidos:
                        setTitle("Partidos");
                        Intent partidos = new Intent(Grupos.this, Partidos.class );
                        startActivity(partidos);
                        break;

                    case R.id.nav_grupos:
                        setTitle("Grupos");

                        break;

                    case R.id.nav_ajustes:
                        setTitle("Ajustes");
                        Intent ajustes = new Intent(Grupos.this, LogIn.class );
                        startActivity(ajustes);
                        break;
                }

                return false;
            }
        });
    }

}