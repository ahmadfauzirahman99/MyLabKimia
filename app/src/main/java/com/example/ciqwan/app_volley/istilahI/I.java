package com.example.ciqwan.app_volley.istilahI;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;



/**
 * Created by AHMAD FAUZI RAHMAN on 26/06/2016.
 */
public class I extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        String[] Listrs = new String[]{"iddm","ikatanglikosida", "Ikatan Hidrogen",
                "Ikatan Ion","Ikatan Kovalen","Ikatan Logam"};
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
            if (pilihan.equals("iddm")) {
                i = new Intent(this,IDDM.class);
            } else if (pilihan.equals("ikatanglikosida")) {
                i = new Intent(this,IkatanGlikosida.class);
            }else if(pilihan.equals("Ikatan Ion")){
                i=new Intent(this,IkatanIon.class);
            }else if(pilihan.equals("Ikatan Kovalen")) {
                i = new Intent(this,IkatanKovalen.class);
            }else if(pilihan.equals("Ikatan Logam")) {
                i = new Intent(this,IkatanLogam.class);




            }
            startActivity(i);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}


