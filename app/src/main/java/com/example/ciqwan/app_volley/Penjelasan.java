package com.example.ciqwan.app_volley;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Penjelasan extends AppCompatActivity {
    Button b1,b2;
    ImageButton b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penjelasan);

       b1 = (Button) findViewById(R.id.button5);
       b2 = (Button) findViewById(R.id.button6);
        b3= (ImageButton) findViewById(R.id.imageButton4) ;



        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showback();
            }
        });

    b2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        showhitung();
    }
});
        b1.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

            showrumus();

            }

        });

    }



    private void showback() {

        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

    private void showhitung() {
        Intent i = new Intent(this,Penjelasanhitung.class);
        startActivity(i);
    }

    private void showrumus() {
        Intent i = new Intent(this,PenjelasanVolume.class);
        startActivity(i);
    }
}

