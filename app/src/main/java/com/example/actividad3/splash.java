package com.example.actividad3;
import androidx.appcompat.app.AppCompatActivity;

import android.provider.Settings;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.os.CountDownTimer;
import android.os.CountDownTimer;
import android.widget.TextView;

import java.nio.channels.InterruptedByTimeoutException;

public class splash extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        TextView cuenta=findViewById(R.id.cuenta);



        new CountDownTimer(5000, 1000) {

            public void onTick(long restante) {
                int tiempo= (int) restante / 1000;
                cuenta.setText(String.valueOf(tiempo));
            }
            public void onFinish() {
                startActivity(new Intent(splash.this,MainActivity2.class));
            }
        }.start();

    }



}
