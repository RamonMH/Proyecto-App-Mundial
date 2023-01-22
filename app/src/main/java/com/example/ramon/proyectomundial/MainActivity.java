package com.example.ramon.proyectomundial;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    ListViewAdapter adapter;
    String[]titulo = new String[]
            {
                    "Estos son los grupos para la copa del mundo",
                    "En estos estadios se disputara la copa del mundo",
                    "Mexico no convence de cara al mundia",
                    "Nike presenta la coleccion mundialista"
            };

    int[] imagenes = {
            R.drawable.grupos,
            R.drawable.estadio,
            R.drawable.mexico,
            R.drawable.packnike
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Noticias");
        bottomNavigationView=(BottomNavigationView) findViewById(R.id.bottomNavigationView);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        final ListView lista =(ListView) findViewById(R.id.listNoti);

        adapter=new ListViewAdapter(this, titulo, imagenes);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
                switch (i)
                {
                    case 0:
                        Intent grupos = new Intent(MainActivity.this, ArticuloGrupos.class);
                        startActivity(grupos);
                        break;
                    case 1:
                        Intent estadios = new Intent(MainActivity.this, ArticuloEstadios.class);
                        startActivity(estadios);
                        break;
                    case 2:
                        Intent mexico = new Intent(MainActivity.this, ArticuloSeleccion.class);
                        startActivity(mexico);
                        break;
                    case 3:
                        Intent nike = new Intent(MainActivity.this, ArticuloNike.class);
                        startActivity(nike);
                        break;
                }

            }
        });

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_noticias:
                        setTitle("Noticias");
                        break;

                    case R.id.nav_partidos:
                        setTitle("Partidos");
                        Intent part = new Intent(MainActivity.this, Partidos.class );
                        startActivity(part);
                        break;

                    case R.id.nav_grupos:
                        setTitle("Grupos");
                        Intent grup = new Intent(MainActivity.this, Grupos.class );
                        startActivity(grup);
                        break;

                    case R.id.nav_ajustes:
                        setTitle("Ajustes");
                        Intent ajustes = new Intent(MainActivity.this, LogIn.class );
                        startActivity(ajustes);
                        break;
                }

                return false;
            }
        });
    }
}
