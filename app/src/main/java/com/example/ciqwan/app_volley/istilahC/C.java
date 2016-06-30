package com.example.ciqwan.app_volley.istilahC;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by AHMAD FAUZI RAHMAN on 26/06/2016.
 */
public class C extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        String[] Listrs = new String[]{"C Asimetri","Cincin Piranosa", "CMC", "Coulomb"};
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
            if (pilihan.equals("C Asimetri")) {
                i = new Intent(this,CAsimetri.class);
            } else if (pilihan.equals("Cincin Piranosa")) {
                i = new Intent(this,CincinPiranosa.class);
            }else if(pilihan.equals("CMC")){
                i=new Intent(this,CMC.class);
            }else if(pilihan.equals("Coulomb")) {
                i = new Intent(this,Coulomb.class);

            }
            startActivity(i);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

