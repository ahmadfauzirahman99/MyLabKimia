package com.example.ciqwan.app_volley;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by AHMAD FAUZI RAHMAN on 28/06/2016.
 */
public class SoalQuis1 extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soalquis);

        Button mulai =(Button) findViewById(R.id.mulai);

        mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showmulai();
            }
        });
    }

    private void showmulai() {
    Intent i = new Intent(SoalQuis1.this,SoalQuis.class);
        startActivity(i);
    }

}

