package com.example.ciqwan.app_volley.istilahD;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by AHMAD FAUZI RAHMAN on 26/06/2016.
 */
public class D extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        String[] Listrs = new String[]{"Deaminasi","Defisiensi Vitamin", "Dehidrogenase", "Dehidrohalogenasi","Dekarboksilasi"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Listrs));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihanrs(pilihan);

    }

    private void tampilkanpilihanrs(String pilihan) {
        try {
            Intent i = null;
            if (pilihan.equals("Deaminasi")) {
                i = new Intent(this,Deaminasi.class);
            } else if (pilihan.equals("Defisiensi Vitamin")) {
                i = new Intent(this,DefisiensiVitamin.class);
            }else if(pilihan.equals("Dehidrogenase")){
                i=new Intent(this,Dehidrogenase.class);
            }else if(pilihan.equals("Dehidrohalogenasi")) {
                i = new Intent(this,Dehidrohalogenasi.class);
            }else if(pilihan.equals("Dekarboksilasi")) {
                i = new Intent(this,Dekarboksilasi.class);

            }
            startActivity(i);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}


