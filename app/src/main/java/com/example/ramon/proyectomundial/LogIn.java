package com.example.ramon.proyectomundial;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogIn extends AppCompatActivity {
    EditText txtUsuario, txtContrasena;
    Button btnIngresar;
    private Cursor fila;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        botonatras();
        txtUsuario = (EditText) findViewById(R.id.usuario);
        txtContrasena = (EditText) findViewById(R.id.contasena);
        btnIngresar = findViewById(R.id.ingresar);

        View.OnClickListener evento = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.ingresar)
                    ajustes();
            }
        };
        btnIngresar.setOnClickListener(evento);
    }

    public void ajustes (){
        String usuario=((EditText) findViewById(R.id.usuario)).getText().toString();
        String pass=((EditText) findViewById(R.id.contasena)).getText().toString();
        if (usuario.equals("admin")&& pass.equals("admin"))
        {
            startActivity(new Intent(LogIn.this, Ajustes.class));
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Usuario Incorrecto",Toast.LENGTH_SHORT).show();
        }
    }

    /*public void ingresarajustes (){

        ConexionSQLiteHelper admin = new ConexionSQLiteHelper(this, "mundial",null,1);
        SQLiteDatabase db = admin.getWritableDatabase();
        String usuario = txtUsuario.getText().toString();
        String contrasena = txtContrasena.getText().toString();
        fila=db.rawQuery("select usuario,contrasena from admins where usuario='"+usuario+"' and contrasena='"+contrasena+"'",null);

        if(fila.moveToFirst()) {

            String usuarios = fila.getString(0);
            String contrasenas = fila.getString(1);

            if (usuario.equals(usuarios) && contrasena.equals(contrasenas)) {
                Intent config = new Intent(LogIn.this, Ajustes.class);
                startActivity(config);
                txtUsuario.setText("");
                txtContrasena.setText("");
            }
        }
            else
                Toast.makeText(getApplicationContext(),"Usuario o contraseña incorrecto",Toast.LENGTH_LONG).show();
                txtUsuario.setText("");
                txtContrasena.setText("");
        }*/

    @SuppressLint("RestrictedApi")
    private void botonatras(){
        ActionBar barra = getSupportActionBar();
        if(barra!=null){
            barra.setDefaultDisplayHomeAsUpEnabled(true);
            barra.setTitle("Regresar");
        }
    }
}
