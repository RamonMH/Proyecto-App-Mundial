package com.example.ramon.proyectomundial;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistroGrupos extends AppCompatActivity {
    EditText txtId, txtEquipo, txtPuntos;
    Button btnRegistrar, btnBuscar, btnBorrar, btnActualizar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_grupos);

        txtId = findViewById(R.id.idgrupo);
        txtEquipo = findViewById(R.id.equipo);
        txtPuntos = findViewById(R.id.puntos);
        btnRegistrar = findViewById(R.id.registrar);
        btnBuscar = findViewById(R.id.buscar);
        btnBorrar = findViewById(R.id.borrar);
        btnActualizar = findViewById(R.id.actualizar);

        final AyudaBDDos ayudabd = new AyudaBDDos(getApplicationContext());

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SQLiteDatabase db = ayudabd.getWritableDatabase();
                ContentValues valores = new ContentValues();
                valores.put(AyudaBDDos.DatosTabla.COLUMNA_ID,txtId.getText().toString());
                valores.put(AyudaBDDos.DatosTabla.COLUMNA_EQUIPO, txtEquipo.getText().toString());
                valores.put(AyudaBDDos.DatosTabla.COLUMNA_PUNTOS, txtPuntos.getText().toString());

                Long IdGuardado = db.insert(AyudaBDDos.DatosTabla.NOMBRE_TABLA, AyudaBDDos.DatosTabla.COLUMNA_ID, valores);
                Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado, Toast.LENGTH_LONG).show();

            }
        });

        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SQLiteDatabase db = ayudabd.getReadableDatabase();
                String[] argsel = {txtId.getText().toString()};
                String[] projection = {
                        AyudaBDDos.DatosTabla.COLUMNA_EQUIPO, AyudaBDDos.DatosTabla.COLUMNA_PUNTOS};
                Cursor c = db.query(AyudaBDDos.DatosTabla.NOMBRE_TABLA, projection, AyudaBDDos.DatosTabla.COLUMNA_ID+"=?",argsel,null,null,null);

                c.moveToFirst();
                txtEquipo.setText(c.getString(0));
                txtPuntos.setText(c.getString(1));

            }
        });

        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SQLiteDatabase db = ayudabd.getWritableDatabase();
                String Selection = AyudaBDDos.DatosTabla.COLUMNA_ID+"=?";
                String[] argsel = {txtId.getText().toString()};

                db.delete(AyudaBDDos.DatosTabla.NOMBRE_TABLA,Selection,argsel);





            }
        });

        btnActualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = ayudabd.getWritableDatabase();
                ContentValues valores = new ContentValues();
                valores.put(AyudaBDDos.DatosTabla.COLUMNA_EQUIPO, txtEquipo.getText().toString());
                valores.put(AyudaBDDos.DatosTabla.COLUMNA_PUNTOS, txtEquipo.getText().toString());
                String[] argsel = {txtId.getText().toString()};
                String Selection = AyudaBDDos.DatosTabla.COLUMNA_ID+"=?";

                int count = db.update(AyudaBDDos.DatosTabla.NOMBRE_TABLA,valores,Selection,argsel);

            }
        });
    }
}

