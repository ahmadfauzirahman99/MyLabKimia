package com.example.ciqwan.app_volley;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AHMAD FAUZI RAHMAN on 26/06/2016.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Kamus.db";
    public static final String TABLE_NAME = "user_table";

    public static final String COM_1 = "ID";
    public static final String COM_2 = "NAME";
    public static final String COM_3 = "USERNAME";
    public static final String COM_4 = "PASSWORD";
    public static final String COM_5 = "ALAMAT";
    public static final String COM_6 = "NOHP";
    public static final String COM_7 = "JENIS_KELAMIN";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,USERNAME TEXT,PASSWORD TEXT, ALAMAT TEXT,NOHP INTEGER,JENIS_KELAMIN TEXT)");
        String sql = "CREATE TABLE IF NOT EXISTS tbl_soal(id INTEGER PRIMARY KEY AUTOINCREMENT, soal TEXT, pil_a TEXT, pil_b TEXT, pil_c TEXT, jwban INTEGER, img BLOB)";
        db.execSQL(sql);


        ContentValues values = new ContentValues();
        values.put("soal", "Apa name latin dari gambar di samping?");
        values.put("pil_a", "Punica granatum L.");
        values.put("pil_b","Durio zibethinus L.");
        values.put("pil_c", "Lansium domesticum Correa.");
        values.put("jwban","1");
        values.put("img", R.drawable.durian);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Apa name latin dari gambar di samping?");
        values.put("pil_a", "Punica granatum L.");
        values.put("pil_b","Durio zibethinus L.");
        values.put("pil_c", "Lansium domesticum Correa.");
        values.put("jwban","2");
        values.put("img", R.drawable.langsat);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Apa name latin dari gambar di samping?");
        values.put("pil_a", "Artocarpus heterophillya atau Artocarpus integra");
        values.put("pil_b","Ananas comosus Merr.");
        values.put("pil_c", "Morinda citrifolia L.");
        values.put("jwban","1");
        values.put("img", R.drawable.nanas);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Apa name latin dari gambar di samping?");
        values.put("pil_a", "Artocarpus heterophillya atau Artocarpus integra");
        values.put("pil_b","Ananas comosus Merr.");
        values.put("pil_c", "Morinda citrifolia L.");
        values.put("jwban","0");
        values.put("img", R.drawable.nangka);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Apa name latin dari gambar di samping?");
        values.put("pil_a", "Pyrus communis ");
        values.put("pil_b","Musa sp.");
        values.put("pil_c", "Niphelium lappaceum L.");
        values.put("jwban","1");
        values.put("img", R.drawable.pisang);
        db.insert("tbl_soal", "soal", values);

        String sql2 = "CREATE TABLE IF NOT EXISTS tbl_gambar(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, img BLOB)";
        db.execSQL(sql2);

        ContentValues v = new ContentValues();
        v.put("name", "Durian");
        v.put("img", R.drawable.durian);
        db.insert("tbl_gambar", "name", v);

        v.put("name", "Langsat");
        v.put("img", R.drawable.langsat);
        db.insert("tbl_gambar", "name", v);

    }

    public List<Soal> getSoal(){
        List<Soal> listSoal = new ArrayList<Soal>();
        String query = "select * from tbl_soal";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        if(cursor.moveToFirst()){
            do{
                Soal s = new Soal();
                s.setSoal(cursor.getString(1));
                s.setPil_a(cursor.getString(2));
                s.setPil_b(cursor.getString(3));
                s.setPil_c(cursor.getString(4));
                s.setJwban(cursor.getInt(5));
                s.setGambar(cursor.getInt(6));
                listSoal.add(s);
            }while(cursor.moveToNext());
        }

        return listSoal;
    }





    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS tbl_soal");
        db.execSQL("DROP TABLE IF EXISTS tbl_gambar");


        onCreate(db);
    }

    public boolean insertData(String nama, String username, String password, String alamat, String nohp, String jkmn) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COM_2, nama);
        contentValues.put(COM_3, username);
        contentValues.put(COM_4, password);
        contentValues.put(COM_5, alamat);
        contentValues.put(COM_6, nohp);
        contentValues.put(COM_7, jkmn);

        long result = db.insert(TABLE_NAME, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;

    }



    public String GetSingleEntry(String Username)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor =db.query("user_table" ,null,"USERNAME=?",new String[]{Username},null,null,null);
            if (cursor.getCount() < 1)
            {
                cursor.close();
                return "NOT EXIST";
            }
            cursor.moveToFirst();
            String password = cursor.getString(cursor.getColumnIndex("PASSWORD"));
            cursor.close();
            return password;
        }

    }



