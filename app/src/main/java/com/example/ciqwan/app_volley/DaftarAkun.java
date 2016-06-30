package com.example.ciqwan.app_volley;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by AHMAD FAUZI RAHMAN on 26/06/2016.
 */
public class DaftarAkun extends Activity {
    EditText username, password, name, address, nohp;
    Button signup, batal;
    DatabaseHelper mydb;
    CheckBox view;
    RadioGroup jeniskelamin;
    String gender;
    RadioButton lakilaki, perempuan;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daftar);
        view = (CheckBox)findViewById(R.id.vw);
        mydb = new DatabaseHelper(this);
        username = (EditText) findViewById(R.id.username1);
        password = (EditText) findViewById(R.id.password1);
        name = (EditText) findViewById(R.id.nama);
        address = (EditText) findViewById(R.id.alamat);
        nohp = (EditText) findViewById(R.id.hp);
        signup = (Button) findViewById(R.id.buat);
        batal = (Button) findViewById(R.id.cancel);
        jeniskelamin = (RadioGroup) findViewById(R.id.jk);
        lakilaki = (RadioButton)findViewById(R.id.lk);
        perempuan = (RadioButton)findViewById(R.id.pr);
        AddData();

        view.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(!isChecked) {
                    password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
            }
        });


    }

    public void AddData(){
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lakilaki.isChecked()) {
                    gender = "Laki-Laki";
                } else if (perempuan.isChecked()){
                    gender = "Perempuan";
                }
                boolean isInserted = mydb.insertData(name.getText().toString(),
                        username.getText().toString(),
                        password.getText().toString(),
                        address.getText().toString(),
                        nohp.getText().toString(),
                        gender);

                if (isInserted = true) {
                    Toast.makeText(DaftarAkun.this, "Data Inserted", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(DaftarAkun.this, Login.class);
                    startActivity(i);
                }else {
                    Toast.makeText(DaftarAkun.this, "Data not Inserted", Toast.LENGTH_LONG).show();
                }

            }
        });

        batal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(DaftarAkun.this, Login.class);
                startActivity(a);
            }
        });
    }

}