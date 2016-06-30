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
public class MainHitungEnergi extends Activity {

ImageButton b3;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hitungenerg);
        final EditText edtLintasan = (EditText) findViewById(R.id.edtLintasan);
        final EditText edtMassa = (EditText) findViewById(R.id.edtMassa);
        final EditText edtLebar = (EditText) findViewById(R.id.edtLebar);
        final Button btnHitung = (Button) findViewById(R.id.btnHitung);
        final TextView txtHasil = (TextView) findViewById(R.id.txtHasil);

        b3 = (ImageButton) findViewById(R.id.back);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showb3();
            }
        });

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                Double h = 6.62e-34;
                Double ev = 1.6e+19;
                Double Massa, Lebar, hasil;
                Integer Lintasan;

                Lintasan = Integer.parseInt(edtLintasan.getText().toString());
                Massa = Double.parseDouble(edtMassa.getText().toString());
                Lebar = Double.parseDouble(edtLebar.getText().toString());

                hasil= (Math.pow(h, 2)*Math.pow(Lintasan, 2))/(8*Massa*Math.pow(Lebar, 2));
                hasil = hasil*ev;
                txtHasil.setText("Energi lintasan "+Lintasan+" : "+hasil);
            }
        });
    }

    private void showb3() {
        Intent i = new Intent (this,Penjelasan.class);
        startActivity(i);
    }


}
