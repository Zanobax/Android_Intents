package com.example.actividad3;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.provider.MediaStore;
import android.provider.Settings;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.provider.ContactsContract;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
         Button i1=findViewById(R.id.intentEX1),
         i2=findViewById(R.id.intentEX2),
         i3=findViewById(R.id.intentEX3),
         i4=findViewById(R.id.intentEX4),
         i5=findViewById(R.id.intentIM1),
         i6=findViewById(R.id.intentIM2),
         i7=findViewById(R.id.intentIM3),
         i8=findViewById(R.id.intentIM4);

        i1.setOnClickListener(this);

        i2.setOnClickListener(this);

        i3.setOnClickListener(this);

        i4.setOnClickListener(this);

        i5.setOnClickListener(this);

        i6.setOnClickListener(this);

        i7.setOnClickListener(this);

        i8.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.intentEX1) {
            Intent l = new Intent(Settings.ACTION_SETTINGS);
            startActivity(l);
        }else if (view.getId() == R.id.intentEX2) {
            Intent l = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:" + "1wvL99nmIUU"));
            startActivity(l);
        }else if (view.getId() == R.id.intentEX3) {
            Intent l = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivity(l);
        }else if (view.getId() == R.id.intentEX4) {
            Intent l = new Intent(Intent.ACTION_VIEW, Uri.parse
                    ("https://www.facebook.com/?locale=es_LA"));



            startActivity(l);
        }else if (view.getId() == R.id.intentIM1) {
            Intent l = new Intent(Intent.ACTION_VIEW, Uri.parse
                    ("https://www.google.com/search?client=opera-gx&q=exitos+de+chalino&sourceid=opera&ie=UTF-8&oe=UTF-8"));
            startActivity(l);
        }else if (view.getId() == R.id.intentIM2) {
            Intent l = new Intent(Intent.ACTION_VIEW,ContactsContract.Contacts.CONTENT_URI);
            startActivity(l);
        }else if (view.getId() == R.id.intentIM3) {
            Intent l = new Intent(Intent.ACTION_VIEW, Uri.parse
                    ("https://www.instagram.com"));
            startActivity(l);
        }else if (view.getId() == R.id.intentIM4) {
            Intent l = new Intent(Intent.ACTION_SEND);
            l.setType("text/plain");
            l.putExtra(Intent.EXTRA_TEXT, "Gato_panzon.jpg");
            startActivity(Intent.createChooser(l, "Compartir con"));
        }

    }
}
