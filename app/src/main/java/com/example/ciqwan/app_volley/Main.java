package com.example.ciqwan.app_volley;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by AHMAD FAUZI RAHMAN on 30/06/2016.
 */
public class Main extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
     ImageButton add = (ImageButton) findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showtambah();
            }
        });

    }

    private void showtambah() {
        Intent i = new Intent(this,BiodataPenggunaAplikasikimia.class);
        startActivity(i);
    }
}