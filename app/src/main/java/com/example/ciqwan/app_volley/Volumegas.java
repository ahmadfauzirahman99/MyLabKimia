package com.example.ciqwan.app_volley;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by AHMAD FAUZI RAHMAN on 27/06/2016.
 */
public class Volumegas extends Activity {
    EditText Mol, Rgas, Temperatur, Tekanan;
    Button btnHitung;
    TextView txtVolume;
    ImageButton b3;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.volumegas);
        //Membaca komponen input yang ada di layout

        Mol = (EditText) findViewById(R.id.edtMol);
        Rgas = (EditText) findViewById(R.id.edtRgas);
        Temperatur = (EditText) findViewById(R.id.edtTemperatur);
        Tekanan = (EditText) findViewById(R.id.edtTekanan);
        b3 = (ImageButton) findViewById(R.id.back);


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showback();
            }
        });





//Membaca komponen button dari layout
        btnHitung = (Button) findViewById(R.id.btnHitung);

//Membaca komponen output dari layout

        txtVolume = (TextView) findViewById(R.id.txtVolume);

//Meng-handle ketika button di klik

        btnHitung.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
// TODO Auto-generated method stub

//Deklarasi variable n,R,T,p sebagai bilangan real Double

                Double n,R,T,p,volume;

//Mengubah string menjadi bilangan real Double

                n= Double.parseDouble(Mol.getText().toString());
                R= Double.parseDouble(Rgas.getText().toString());
                T= Double.parseDouble(Temperatur.getText().toString());
                p= Double.parseDouble(Tekanan.getText().toString());

//Rumus menghitung volume gas

                volume=(n*R*T)/p;

                txtVolume.setText("Volume gas: "+volume);

            }
        });

    }

    private void showback() {
        Intent i = new Intent(this,PenjelasanVolume.class);
        startActivity(i);
    }
    }


