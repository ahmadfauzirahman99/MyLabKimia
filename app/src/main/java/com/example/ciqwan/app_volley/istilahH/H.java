package com.example.ciqwan.app_volley.istilahH;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by AHMAD FAUZI RAHMAN on 26/06/2016.
 */
public class H extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        String[] Listrs = new String[]{"Hukum Kekekalan Energi","Hukum Kekekalan Massa", "Hukum Laplace",
                "Hukum Perbandingan Beganda","Hukum Perbandingan Tetap","Hukum Perbandingan Volume"};
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
            if (pilihan.equals("Hukum Kekekalan Energi")) {
                i = new Intent(this,HukumKekekalanEnergi.class);
            } else if (pilihan.equals("Hukum Kekekalan Massa")) {
                i = new Intent(this,HukumKekekalanMassa.class);
            }else if(pilihan.equals("Hukum Laplace")){
                i=new Intent(this,HukumLaplace.class);
            }else if(pilihan.equals("Hukum Perbandingan Beganda")) {
                i = new Intent(this,HukumPerbandinganBeganda.class);
            }else if(pilihan.equals("Hukum Perbandingan Tetap")) {
                i = new Intent(this,HukumPerbandinganTetap.class);
            }else if(pilihan.equals("Hukum Perbandingan Volume")) {
                i = new Intent(this,HukumPerbandinganVolume.class);



            }
            startActivity(i);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}


