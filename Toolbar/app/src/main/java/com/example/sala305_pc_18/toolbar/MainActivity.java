package com.example.sala305_pc_18.toolbar;

import android.annotation.SuppressLint;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.appbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_uno , menu);
        return true; }

    @SuppressLint("WrongConstant")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Nuevo:
                Toast.makeText(getApplicationContext(),"Click en NUEVO",Toast.LENGTH_SHORT).show();
                //Toast.makeText(this,"Click en NUEVO",0).show();
                return true;

            case R.id.Buscar:
                Toast.makeText(getApplicationContext(),"Click en BUSCAR",Toast.LENGTH_SHORT).show();
                //Toast.makeText(this,"Click en BUSCAR",1).show();
                return true;

            case R.id.Configuraciones:
                Toast.makeText(getApplicationContext(),"Click en Configuracion",Toast.LENGTH_SHORT).show();
                //Toast.makeText(this,"Click en CONFIGURACIONES",1).show(); //EL VALOR DE DURACION ESTA DADO EN SEGUNDOS
                return true;
            default:
                 return super.onOptionsItemSelected(item);
        }
    }

    public void onClickFAB(View view) {
        Snackbar.make(view, "Se presionó el FloatingActionButton - FAB", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }
}
