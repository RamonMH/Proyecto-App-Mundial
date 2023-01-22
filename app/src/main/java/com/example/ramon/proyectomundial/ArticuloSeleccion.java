package com.example.ramon.proyectomundial;

import android.annotation.SuppressLint;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ArticuloSeleccion extends AppCompatActivity {
    TextView txtNoticia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articulo_seleccion);
        botonatras();
        txtNoticia=findViewById(R.id.noticia);

        txtNoticia.setText("Es verdad que para el técnico el objetivo seguramente tiene que ver con algo muy distinto al resultado. Pero a ocho días de debutar en la Copa del Mundo, una derrota y, sobre todo, la forma, siembra más dudas de las ya existentes. Al Tricolor de Juan Carlos Osorio le han bastado tres minutos de pesadilla para derrumbarse. Derrota por 0-2 ante Dinamarca, en Copenhague, en el último amistoso antes de Rusia 2018.\n" +
                "La prueba final. Al parecer, el funcionamiento ya está definido: Juan Carlos Osorio tiene claro que ante Alemania parará con 4-3-3. Justo así salta el Tricolor al campo en Copenhague, para enfrentar a Dinamarca. ¿Qué puede experimentar entonces el técnico nacional? Nombres. Y además, ver a quienes vienen de lesión.\n" +
                "Héctor Moreno y Andrés Guardado acaban de recuperarse. Van de arranque en este duelo, a ocho días del debut mundialista frente a Alemania. El primero se nota falto de ritmo, incluso perdiendo pelotas comprometidas. El segundo se ve más entero en medio campo, prácticamente listo para ser titular en Rusia 2018.\n"+
        "México no la pasa bien en los primeros minutos. Apenas al arranque, un cabezazo de Nicolai Jorgensen pone a temblar a la zaga nacional. Se va por un costa. Después, las fallas de Moreno: pierde la primera pelota al ‘7, pero Carlos Salcedo salva al Tri con una barrida dentro del área; la segunda pifia ocurre al ‘12 y esta vez la jugada concluye con un servicio raso que Jorgensen remata y Guillermo Ochoa tapa con apuros.");
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
