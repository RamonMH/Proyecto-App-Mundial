package com.example.ramon.proyectomundial;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.Telephony;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Partidos extends AppCompatActivity {
    ListView lst;
    ArrayList <String> Lista;
    ArrayAdapter adapter;
    AyudaBD conn;

    private BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partidos);
        setTitle("Partidos");
        lst=findViewById(R.id.listPartidos);

        AyudaBD conn = new AyudaBD(getApplicationContext());
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
                        Intent noti = new Intent(Partidos.this, MainActivity.class);
                        startActivity(noti);
                        break;

                    case R.id.nav_partidos:
                        setTitle("Partidos");

                        break;

                    case R.id.nav_grupos:
                        setTitle("Grupos");
                        Intent grup = new Intent(Partidos.this, Grupos.class );
                        startActivity(grup);
                        break;

                    case R.id.nav_ajustes:
                        setTitle("Ajustes");
                        Intent ajustes = new Intent(Partidos.this, LogIn.class );
                        startActivity(ajustes);
                        break;
                }

                return false;
            }
        });
    }

}
