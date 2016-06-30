package com.example.ciqwan.app_volley;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataCenter extends SQLiteOpenHelper {
	
	private static final String DATABASE_NAME = "crud.db";
	private static final int DATABASE_VERSION = 1;
	public DataCenter(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		String sql = "create table biodata(kode integer primary key, nama text null, phone text null, jk text null, alamat text null);";
		Log.d("Data", "onCreate: " + sql);
		db.execSQL(sql);
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

}
