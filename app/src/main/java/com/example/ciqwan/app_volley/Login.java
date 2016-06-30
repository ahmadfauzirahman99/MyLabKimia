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
import android.widget.TextView;
import android.widget.Toast;


public class Login extends Activity {
    DatabaseHelper mydb;
    EditText user, pass;
    Button lo;
    TextView da;
    CheckBox vw;

    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        mydb =new DatabaseHelper(this);
        user = (EditText)findViewById(R.id.username);
        pass = (EditText) findViewById(R.id.password);
        lo = (Button)findViewById(R.id.log);
        da = (TextView)findViewById(R.id.Register);
        vw = (CheckBox)findViewById(R.id.view);


        vw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(!isChecked) {
                    pass.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    pass.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
            }
        });
        lo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String Us = user.getText().toString();
                String ps = pass.getText().toString();
                String s= mydb.GetSingleEntry(Us);
                if(ps.equals(s)){
                    Toast.makeText(Login.this,"sukses", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(Login.this, MainActivity.class);
                    startActivity(i);
                }else {
                    Toast.makeText(Login.this,"Username or Password Incorect", Toast.LENGTH_LONG).show();
                }

            }
        });

        da.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login.this, DaftarAkun.class);
                startActivity(i);
            }
        });
    }
}
