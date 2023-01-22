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

public class RegistroPartidos extends AppCompatActivity {
    EditText txtId, txtLocal, txtVisita, txtMarcador, txtGrupo;
    Button btnRegistrar, btnBuscar, btnBorrar, btnActualizar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_partidos);
        txtId = findViewById(R.id.id);
        txtLocal = findViewById(R.id.local);
        txtVisita = findViewById(R.id.visita);
        txtMarcador = findViewById(R.id.marcador);
        txtGrupo = findViewById(R.id.grupo);
        btnRegistrar = findViewById(R.id.registrar);
        btnBuscar = findViewById(R.id.buscar);
        btnBorrar = findViewById(R.id.borrar);
        btnActualizar = findViewById(R.id.actualizar);

        final AyudaBD ayudabd = new AyudaBD(getApplicationContext());

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SQLiteDatabase db = ayudabd.getWritableDatabase();
                ContentValues valores = new ContentValues();
                valores.put(AyudaBD.DatosTabla.COLUMNA_ID, txtId.getText().toString());
                valores.put(AyudaBD.DatosTabla.COLUMNA_LOCAL, txtLocal.getText().toString());
                valores.put(AyudaBD.DatosTabla.COLUMNA_VISITA, txtVisita.getText().toString());
                valores.put(AyudaBD.DatosTabla.COLUMNA_MARCADOR, txtMarcador.getText().toString());
                valores.put(AyudaBD.DatosTabla.COLUMNA_GRUPO, txtGrupo.getText().toString());

                Long IdGuardado = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_ID, valores);
                Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado, Toast.LENGTH_LONG).show();

            }
        });

        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SQLiteDatabase db = ayudabd.getReadableDatabase();
                String[] argsel = {txtId.getText().toString()};
                String[] projection = {
                        AyudaBD.DatosTabla.COLUMNA_LOCAL, AyudaBD.DatosTabla.COLUMNA_VISITA, AyudaBD.DatosTabla.COLUMNA_MARCADOR, AyudaBD.DatosTabla.COLUMNA_GRUPO};
                Cursor c = db.query(AyudaBD.DatosTabla.NOMBRE_TABLA, projection, AyudaBD.DatosTabla.COLUMNA_ID+"=?",argsel,null,null,null, null);

                c.moveToFirst();
                txtLocal.setText(c.getString(0));
                txtVisita.setText(c.getString(1));
                txtMarcador.setText(c.getString(2));
                txtGrupo.setText(c.getString(3));

            }
        });

        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SQLiteDatabase db = ayudabd.getWritableDatabase();
                String Selection = AyudaBD.DatosTabla.COLUMNA_ID+"=?";
                String[] argsel = {txtId.getText().toString()};

                db.delete(AyudaBD.DatosTabla.NOMBRE_TABLA,Selection,argsel);





            }
        });

        btnActualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = ayudabd.getWritableDatabase();
                ContentValues valores = new ContentValues();
                valores.put(AyudaBD.DatosTabla.COLUMNA_LOCAL, txtLocal.getText().toString());
                valores.put(AyudaBD.DatosTabla.COLUMNA_VISITA, txtVisita.getText().toString());
                valores.put(AyudaBD.DatosTabla.COLUMNA_MARCADOR, txtMarcador.getText().toString());
                valores.put(AyudaBD.DatosTabla.COLUMNA_GRUPO, txtGrupo.getText().toString());
                String[] argsel = {txtId.getText().toString()};
                String Selection = AyudaBD.DatosTabla.COLUMNA_ID+"=?";

                int count = db.update(AyudaBD.DatosTabla.NOMBRE_TABLA,valores,Selection,argsel);

            }
        });
    }
}
