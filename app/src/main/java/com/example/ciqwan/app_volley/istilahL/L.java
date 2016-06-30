package com.example.ciqwan.app_volley.istilahL;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by AHMAD FAUZI RAHMAN on 26/06/2016.
 */
public class L extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        String[] Listrs = new String[]{"Larutan ","Larutan Buffer", "Larutan Elektrolit","Lipase",
                "lipid"};
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
            if (pilihan.equals("Larutan ")) {
                i = new Intent(this,Larutan.class);
            } else if (pilihan.equals("Larutan Buffer")) {
                i = new Intent(this,LarutanBuffer.class);
            }else if(pilihan.equals("Larutan Elektrolit")){
                i=new Intent(this,LarutanElektrolit.class);
            }else if(pilihan.equals("Lipase")) {
                i = new Intent(this,Lipase.class);
            }else if(pilihan.equals("lipid")) {
                i = new Intent(this,Lipid.class);




            }
            startActivity(i);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}