package com.example.ciqwan.app_volley.istilahE;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by AHMAD FAUZI RAHMAN on 26/06/2016.
 */
public class E extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        String[] Listrs = new String[]{"Ektoenzim","Elektroforesa", "Elektrokimia", "Elektrolisis Air","Elektron"};
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
            if (pilihan.equals("Ektoenzim")) {
                i = new Intent(this,Ektoenzim.class);
            } else if (pilihan.equals("Elektroforesa")) {
                i = new Intent(this,Elektroforesa.class);
            }else if(pilihan.equals("Elektrokimia")){
                i=new Intent(this,Elektrokimia.class);
            }else if(pilihan.equals("Elektrolisis Air")) {
                i = new Intent(this,ElektrolisisAir.class);
            }else if(pilihan.equals("Elektron")) {
                i = new Intent(this,Elektron.class);

            }
            startActivity(i);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

