package com.example.ciqwan.app_volley.istilahF;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by AHMAD FAUZI RAHMAN on 26/06/2016.
 */
public class F extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        String[] Listrs = new String[]{"Fermi","Formaldehida", "Fosfatase", "Fosfofruktokinase","Fraksi Mol"};
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
            if (pilihan.equals("Fermi")) {
                i = new Intent(this,Fermi.class);
            } else if (pilihan.equals("Formaldehida")) {
                i = new Intent(this,Formaldehida.class);
            }else if(pilihan.equals("Fosfatase")){
                i=new Intent(this,Fosfatase.class);
            }else if(pilihan.equals("Fosfofruktokinase")) {
                i = new Intent(this,Fosfofruktokinase.class);
            }else if(pilihan.equals("Fraksi Mol")) {
                i = new Intent(this,FraksiMol.class);



            }
            startActivity(i);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

