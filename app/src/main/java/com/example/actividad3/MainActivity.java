package com.example.actividad3;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    setContentView(R.layout.activity_main);
    Button primero=findViewById(R.id.boton);

    primero.setOnClickListener(view -> {
        Intent e=new Intent(this,splash.class);
        startActivity(e);
    });
    }


}