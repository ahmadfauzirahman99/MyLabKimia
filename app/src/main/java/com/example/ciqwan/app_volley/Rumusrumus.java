package com.example.ciqwan.app_volley;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by AHMAD FAUZI RAHMAN on 27/06/2016.
 */
public class Rumusrumus extends Activity {
Button volume,hitung;
    ImageButton back;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kumpulanrumusrumus);

        volume= (Button) findViewById(R.id.volumegas);
        hitung= (Button) findViewById(R.id.hitungener);
        back =(ImageButton)findViewById(R.id.imageButton) ;

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showback();
            }
        });

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showhitung();
            }
        });
        volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showvolume();
            }
        });
    }

    private void showback() {
        Intent i= new Intent(this,MainActivity.class);
        startActivity(i);
    }

    private void showhitung() {
        Intent i = new Intent(this,MainHitungEnergi.class);
        startActivity(i);
    }

    private void showvolume() {
        Intent i = new Intent (this,Volumegas.class);
        startActivity(i);
    }
}