package com.example.ciqwan.app_volley.istilahG;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by AHMAD FAUZI RAHMAN on 26/06/2016.
 */
public class G extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        String[] Listrs = new String[]{"Gaya Van Der Waals","Gerak Brown", "Glikogen", "Glikogenesis","Glikogenolisis"};
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
            if (pilihan.equals("Gaya Van Der Waals")) {
                i = new Intent(this,GayaVanDerWaals.class);
            } else if (pilihan.equals("Gerak Brown")) {
                i = new Intent(this,GerakBrown.class);
            }else if(pilihan.equals("Glikogen")){
                i=new Intent(this,Glikogen.class);
            }else if(pilihan.equals("Glikogenesis")) {
                i = new Intent(this,Glikogenesis.class);
            }else if(pilihan.equals("Glikogenolisis")) {
                i = new Intent(this,Glikogenolisis.class);



            }
            startActivity(i);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

