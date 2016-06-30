package com.example.ciqwan.app_volley;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class PenjelasanVolume extends AppCompatActivity {
ImageButton pindah;
    ImageButton b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penjelasan_volume);
        b3= (ImageButton) findViewById(R.id.back) ;

        pindah = (ImageButton) findViewById(R.id.imageButton2);


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showback();
            }
        });
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showpindah();
            }


        });
    }

    private void showback() {
        Intent i = new Intent(this,Penjelasan.class);
        startActivity(i);
    }

    private void showpindah() {
        Intent i = new Intent(this,Volumegas.class);
        startActivity(i);
    }
}
