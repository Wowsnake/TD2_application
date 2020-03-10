package com.example.td2_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static String TAG ="MainActivity";
    public static String NOM ="nom";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void connect (View v){
        Log.d("MainActivity", "J'ai cliqué");
        if (((EditText)findViewById(R.id.password)).getText().toString().equals("xxx")) {
            Log.d(TAG, "PSW OK");
            String name = ((EditText)findViewById(R.id.name)).getText().toString();

            Intent it = new Intent(MainActivity.this, DetailActivity.class);

            it.putExtra("nom", name);

            startActivity(it);
        }
        else
            Toast.makeText(this, "Accès interdit", Toast.LENGTH_SHORT).show();
    }
}
