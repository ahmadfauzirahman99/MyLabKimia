package com.example.ciqwan.app_volley;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BaruActivity extends Activity {
	protected Cursor cursor;
	DataCenter dbHelper;
	Button ton1, ton2;
	EditText text1, text2, text3, text4, text5;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_baru);
		
		dbHelper = new DataCenter(this);
		text1 = (EditText) findViewById(R.id.editText1);
		text2 = (EditText) findViewById(R.id.editText2);
		text3 = (EditText) findViewById(R.id.editText3);
		text4 = (EditText) findViewById(R.id.editText4);
		text5 = (EditText) findViewById(R.id.editText5);
		ton1 = (Button) findViewById(R.id.button1);
		ton2 = (Button) findViewById(R.id.button2);
		// daftarkan even onClick pada btnSimpan
		ton1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				SQLiteDatabase db = dbHelper.getWritableDatabase();
				db.execSQL("insert into biodata(kode, nama, phone, jk, alamat) values('" +
						text1.getText().toString()+"','"+
						text2.getText().toString() +"','" +
						text3.getText().toString()+"','"+
						text4.getText().toString() +"','" +
						text5.getText().toString() + "')");
						Toast.makeText(getApplicationContext(), "Berhasil", Toast.LENGTH_LONG).show();
						BiodataPenggunaAplikasikimia.ma.RefreshList();
						finish();
				}
			});
		ton2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				finish();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.baru, menu);
		return true;
	}

}
