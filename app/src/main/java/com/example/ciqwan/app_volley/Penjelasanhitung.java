package com.example.ciqwan.app_volley;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Penjelasanhitung extends AppCompatActivity {
ImageButton b1,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penjelasanhitung);
        b1 = (ImageButton) findViewById(R.id.imageButton3);
        b3 = (ImageButton) findViewById(R.id.back);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showback();
            }


        });
        b1.setOnClickListener(new View.OnClickListener() {
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
        Intent i = new Intent (this,MainHitungEnergi.class);
        startActivity(i);
    }
}
