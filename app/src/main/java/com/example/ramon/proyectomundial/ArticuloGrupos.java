package com.example.ramon.proyectomundial;

import android.annotation.SuppressLint;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ArticuloGrupos extends AppCompatActivity {
    TextView txtNoticia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articulo_grupos);
        botonatras();
        txtNoticia = findViewById(R.id.noticia);
        txtNoticia.setText("El Mundial Rusia 2018 arranca el 14 de junio y terminará el 15 de julio. ¿Estás listo para seguir a tu selección?\n" +
                "Aquí te diremos cómo van todos los equipos del Mundial en la fase de grupos. Actualizaremos esta nota todos los días. El calendario del Mundial Rusia 2018 lo puedes ver aquí, y aquí puedes leer cómo ver el Mundial en Estados Unidos. \n" +
                "Así quedaron los grupos para Rusia 2018:\n" +
                "\n" +
                "Grupo A\n" +
                "Rusia\n" +
                "Arabia Saudita\n" +
                "Egipto\n" +
                "Uruguay\n" +
                "\n" +
                "Grupo B\n" +
                "Portugal\n" +
                "España\n" +
                "Marruecos\n" +
                "Irán\n" +
                "\n" +
                "Grupo C\n" +
                "Francia\n" +
                "Australia\n" +
                "Perú\n" +
                "Dinamarca\n" +
                "\n" +
                "Grupo D\n" +
                "Argentina\n" +
                "Islandia\n" +
                "Croacia\n" +
                "Nigeria\n" +
                "\n" +
                "Grupo E\n" +
                "Brasil\n" +
                "Suiza\n" +
                "Costa Rica\n" +
                "Serbia\n" +
                "\n" +
                "Grupo F\n" +
                "Alemania\n" +
                "México\n" +
                "Suecia\n" +
                "Corea\n" +
                "\n" +
                "Grupo G\n" +
                "Bélgica \n" +
                "Panamá\n" +
                "Túnez\n" +
                "Inglaterra\n" +
                "\n" +
                "Grupo H\n" +
                "Polonia\n" +
                "Senegal \n" +
                "Colombia\n" +
                "Japón");
    }
    @SuppressLint("RestrictedApi")
    private void botonatras(){
        ActionBar barra = getSupportActionBar();
        if(barra!=null){
            barra.setDefaultDisplayHomeAsUpEnabled(true);
            barra.setTitle("Regresar");

        }
    }
}
