package com.example.ramon.proyectomundial;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

import java.util.ArrayList;

/**
 * Created by CesarAugusto on 17/02/2016.
 */
public class AyudaBD extends SQLiteOpenHelper {

public static abstract class DatosTabla implements BaseColumns {
    public static final String NOMBRE_TABLA = "partidos";
    public static final String COLUMNA_ID = "id";
    public static final String COLUMNA_LOCAL = "local";
    public static final String COLUMNA_VISITA = "visita";
    public static final String COLUMNA_MARCADOR = "marcador";
    public static final String COLUMNA_GRUPO = "grupo";

    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";
    private static final String CREAR_TABLA_1 =
            "CREATE TABLE " + DatosTabla.NOMBRE_TABLA + " (" +
                   DatosTabla.COLUMNA_ID + " INTEGER PRIMARY KEY," +
                    DatosTabla.COLUMNA_LOCAL + TEXT_TYPE + COMMA_SEP +
                    DatosTabla.COLUMNA_VISITA + TEXT_TYPE+ COMMA_SEP +
                    DatosTabla.COLUMNA_MARCADOR + TEXT_TYPE+ COMMA_SEP+
                    DatosTabla.COLUMNA_GRUPO +TEXT_TYPE+ " )";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + DatosTabla.NOMBRE_TABLA;

}

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Partidos.db";

    public AyudaBD(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(DatosTabla.CREAR_TABLA_1);
        //db.execSQL(DatosTablaDos.CREAR_TABLA_2);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL(DatosTabla.SQL_DELETE_ENTRIES);
        onCreate(db);

    }
    public ArrayList llenar (){
        ArrayList<String> lista = new ArrayList<>();
        SQLiteDatabase database = this.getWritableDatabase();
        String  q = "SELECT * FROM partidos";
        Cursor registros = database.rawQuery(q,null);

        if (registros.moveToFirst()){
            do{
                lista.add(registros.getString(0));
                lista.add(registros.getString(1));
                lista.add(registros.getString(2));
                lista.add(registros.getString(3));
            }while (registros.moveToNext());
        }
        return lista;
    }
}
