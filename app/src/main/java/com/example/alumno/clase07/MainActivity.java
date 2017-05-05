package com.example.alumno.clase07;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.SharedPreferencesCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    private static final String RECORDARME="Recordarme";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = this.getSupportActionBar();
        //actionBar.hide();
        actionBar.setDisplayHomeAsUpEnabled(true);

        SharedPreferences prefs = getSharedPreferences("miConfig", Context.MODE_PRIVATE);

        boolean recordarme = prefs.getBoolean(RECORDARME, false);
        Log.d("Recordarme", recordarme+"" );


        MyDialog dialog = new MyDialog();
        dialog.show(this.getSupportFragmentManager(), "lala");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        getMenuInflater().inflate(R.menu.menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        if (item.getItemId() == R.id.op1)
        {
            Log.d("Menu", "Opcion 1");

            SharedPreferences preferences = getSharedPreferences("miConfig", MODE_PRIVATE);

           SharedPreferences.Editor ed= preferences.edit();
            ed.putBoolean(RECORDARME, true);
            ed.apply();
        }
        if (item.getItemId() == android.R.id.home)
        {
            this.finish();
        }

        return true;
    }
}
