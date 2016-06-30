package com.example.ciqwan.app_volley;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AHMAD FAUZI RAHMAN on 28/06/2016.
 */
public class Datacente1 extends SQLiteOpenHelper {
    final static String DB_NAME = "db_kuis";

    public Datacente1(Context context) {
        super(context, DB_NAME, null, 1);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
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
        db.execSQL("DROP TABLE IF EXISTS tbl_soal");
        db.execSQL("DROP TABLE IF EXISTS tbl_gambar");
        onCreate(db);
    }

}