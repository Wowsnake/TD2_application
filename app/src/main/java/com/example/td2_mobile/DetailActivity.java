package com.example.td2_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
       String name = intent.getStringExtra("nom");
        setContentView(R.layout.activity_detail);
        ((TextView)findViewById(R.id.detailName)).setText(name);
    }
}
