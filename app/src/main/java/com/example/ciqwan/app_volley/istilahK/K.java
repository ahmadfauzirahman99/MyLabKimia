package com.example.ciqwan.app_volley.istilahK;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by AHMAD FAUZI RAHMAN on 26/06/2016.
 */
public class K extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        String[] Listrs = new String[]{"Ka ","Kalorimeter", "Karbohidrat","Katabolisme",
                "Katalisator"};
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
            if (pilihan.equals("Ka ")) {
                i = new Intent(this,Ka.class);
            } else if (pilihan.equals("Kalorimeter")) {
                i = new Intent(this,Kalorimeter.class);
            }else if(pilihan.equals("Karbohidrat")){
                i=new Intent(this,Karbohidrat.class);
            }else if(pilihan.equals("Katabolisme")) {
                i = new Intent(this,Katabolisme.class);
            }else if(pilihan.equals("Katalisator")) {
                i = new Intent(this,Katalisator.class);




            }
            startActivity(i);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}