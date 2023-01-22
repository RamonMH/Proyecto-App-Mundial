package com.example.ramon.proyectomundial;

import android.annotation.SuppressLint;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ArticuloEstadios extends AppCompatActivity {
    TextView txtNoticia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articulo_estadios);
        botonatras();
        txtNoticia = findViewById(R.id.noticia);
        txtNoticia.setText("El Mundial de Rusia se disputará en 12 estadios repartidos en 11 sedes en otras tantas ciudades de la ingente extensión de 17 millones de kilómetros cuadrados del país. Nueve coliseos se han construido de cara a la cita, y otros tres han sido reformados para lucir su mejor cara en el torneo.\n"+
                "\n"+
        "-Luzhniki: a pesar de no ser uno de los nuevos estadios, será el hogar en el que se dispute la final. Este recinto de 80.000 es la casa habitual de la selección rusa, ha albergado eventos deportivos de todo tipo y se consolida como la infraestructura más importante del torneo. En él se jugarán siete partidos.\n"+
        "\n"+
        "Spartak Stadium: con 50.000 espectadores de aforo, es el segundo y último estadio que aporta la capital. Su construcción, a la vez que consolidó la oferta de Moscú, también sirvió para alojar, tras 92 años, al Spartak en un campo propio. En su césped se disputarán hasta cinco encuentros.\n"+
        "\n"+
        "Estadio Krestovski: construido en una isla de la ciudad, el coliseo abrió sus puertas en 2017 y, desde entonces, alojará los partidos del Zenit. Con 67.000 espectadores, es el segundo más grande de todo el torneo y se jugarán en él siete partidos. Una de las instalaciones más modernas del mundo puesta a disposición del Mundial.\n"+
        "\n"+
        "Ekaterinburg Arena: el estadio más oriental de todo el Mundial fue reformado en 2015 para la ocasión y ahora posee un aforo de 35.000 espectadores que se consiguió gracias a la implantación de una extrañísima grada supletoria. Es el hogar del Ural y conserva una histórica fachada que es todo un legado arquitectónico. Sobre su hierba se jugarán cuatro partidos.\n"+
        "\n"+
        "Estadio Nizhni Novgorod: situado en un enclave único como es la muerte del río Oka en el inmenso Volga, se ha convertido en la nueva sede del Olympiets y, con sus 45.000 asientos, albergará seis partidos. Una bella ristra de columnas ornamenta una instalación incomparable.\n"+
        "\n"+
        "Kazan Arena: fue, según el presidente Vladimir Putin, el kilómetro cero de la carrera de Rusia por albergar el Mundial. Tiene un aforo de 45.000 personas y es el hogar del Rubin Kazán. En el Mundial, alojará seis partidos, entre ellos el Irán-España de la fase de grupos. \n"+
        "\n"+
        "Samara Arena: uno de los últimos en ser acabado (a finales de abril), el estadio que será la futura casa del Krylya Sovetov es capaz de sentar hasta a 45.000 espectadores y lanza varios guiños a la carrera espacial del país. En su verde se jugarán seis partidos de este Mundial.\n"+
        "\n"+
        "Rostov Arena: otro de los estadios finalizados sobre la bocina (en abril) y con una ubicación espectacular, a orillas del río Don. Es el nuevo campo del Rostov y, con un aforo de 45.000 espectadores, tendrá cinco partidos de la competición. \n"+
        "\n"+
        "Volgograd Arena: una de las nuevas construcciones del país, superó su prueba de fuego con la final de la Copa de Rusia. Tiene otra gran situación, dominando el Volga, y con 45.000 espectadores (la cifra que, salvo excepciones, poseen los nuevos coliseos) será la casa del Rotor. En este Mundial, dará cobijo a cuatro partidos.\n"+
        "\n"+
        "Estadio de Kaliningrado: llegó justo a tiempo para la cita, en abril. Tiene 35.000 plazas, es otro de los coliseos construidos en una isla y dará un nuevo hogar al Baltika. Serán cuatro los partidos que albergue, incluido el último de España en la fase de grupos, ante Marruecos.\n"+
        "\n"+
        "Estadio Fisht: es el último de los estadios reformados para el Mundial. Se inauguró con motivo de los Juegos Olímpicos de Invierno de 2014, tiene 48.000 plazas y su nombre se debe a una montaña en el Cáucaso. Albergará seis partidos del Mundial, entre ellos el Portugal-España.\n"+
        "\n"+
        "Mordovia Arena: en la menos habitada de todas las ciudades del Mundial, este estadio de reciente creación, hogar del Mordovia, está a orillas del río Insar y se inauguró en el mes de abril. Con tan solo dos meses de vida, acogerá cuatro partidos del Mundial y dará cabida a 44.000 espectadores.");
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
