package com.example.ramon.proyectomundial;

import android.annotation.SuppressLint;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ArticuloNike extends AppCompatActivity {
    TextView txtNoticia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articulo_nike);
        botonatras();
        txtNoticia=findViewById(R.id.noticia);

        txtNoticia.setText("Apenas unos pocos días nos separan del gran evento del año; y porqué no de los últimos cuatro años. Se viene una Copa del Mundo a toda máquina y ahora sí, las marcas empiezan a tirar toda la carne al asado, mostrándonos con qué van a salir al campo en esos maravillosos 64 partidos. En el día de la fecha, la marca norteamericana presentó el Nike Just Do It Pack, sus botines para el Mundial de Rusia 2018.\n"+
                "Yendo a cada modelo en particular, los Mercurial 360 en sus dos variantes se verán acompañados de un fuerte naranja, siguiendo la tendencia del colourway de lanzamiento (ver en detalle). Técnicamente destacan por su construcción el hilo Flyknit con canales en relieve y su suela modular. Por su parte, los Hypervenom III, también confeccionados en Flyknit, tendrán como principal diferencial sus paneles hexagonales en casi toda la carcasa para mejorar el grip y añadir confort a cada golpeo. Un verde fluorescente decorará los detalles.\n"+
        "En lo que respecta a los Magista II, que pronto serán sustituidos por otro modelo, no existe cambio alguno en su superficie, también de hilo y con un sinuoso relieve para tener el mejor control de la pelota. El rojo será su principal aliado. Por último, los Tiempo de séptima generación siguen resaltando por su combinación de piel de canguro en el frente, con hilo en el trasero; logrando un perfecto toque de balón y la máxima comodidad. Siguiendo su línea más bien discreta, eligieron un azul como tono secundario.\n");
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
