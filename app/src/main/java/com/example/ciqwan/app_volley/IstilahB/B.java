package com.example.ciqwan.app_volley.IstilahB;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by AHMAD FAUZI RAHMAN on 26/06/2016.
 */
public class B extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        String[] Listrs = new String[]{"Unsur Kimia","Basa", "Basa Konyugasi", "Batere", "Benzena", "Bilangan Avogadro", "Bilangan Kuantum Azimut",
                "Bilangan Kuantum Magnetik","Bilangan Kuantum Spin","Bilangan Oksidasi","Biomolekul","Buih","Busa Padat"};
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
            if (pilihan.equals("Basa")) {
                i = new Intent(this,Basa.class);
            } else if (pilihan.equals("Basa Konyugasi")) {
                i = new Intent(this,BasaKonyugasi.class);
            }else if(pilihan.equals("Batere")){
                i=new Intent(this,Batere.class);
            }else if(pilihan.equals("Benzena")) {
                i = new Intent(this,Benzena.class);
            }else if(pilihan.equals("Bilangan Avogadro")) {
                i = new Intent(this,BilanganAvogadro.class);
            }else if(pilihan.equals("Bilangan Kuantum Azimut")) {
                i = new Intent(this, BilanganKuantumAzimut.class);
            }else if(pilihan.equals("Bilangan Kuantum Magnetik")) {
                i = new Intent(this, BilanganKuantumMagnetik.class);
            }else if(pilihan.equals("Bilangan Kuantum Spin")) {
                i = new Intent(this, BilanganKuantumSpin.class);
            }else if(pilihan.equals("Bilangan Oksidasi")) {
                i = new Intent(this, BilanganOksidasi.class);
            }else if(pilihan.equals("Biomolekul")) {
                i = new Intent(this, Biomolekul.class);
            }else if(pilihan.equals("Buih")) {
                i = new Intent(this, Buih.class);
            }else if(pilihan.equals("Busa Padat")) {
                i = new Intent(this, BusaPadat.class);
            }
            startActivity(i);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

