package com.javiersanchezdaza.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView t = (TextVIew) findViewById(R.id.text_view);

        Log.d(TAG, "onCreate: " + getString(R.string.app_name));

        Toast.makeText(this, "Son las 14:30 y tengo un hambre que me muero!", Toast.LENGTH_LONG).show();
    }

    public void topClick(View v) {
        Toast.makeText(this, "He pulsado el botón de arriba", Toast.LENGTH_LONG).show();


    }

    public void bottomClick(View v) {
        Toast.makeText(this, "He pulsado el botón de abajo", Toast.LENGTH_LONG).show();

    }

}
