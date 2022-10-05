package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class compartir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compartir);
    }

    public void Regresar(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();
    }
}