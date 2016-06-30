package com.example.ciqwan.app_volley.istilahP;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.ciqwan.app_volley.istilahN.NAD;
import com.example.ciqwan.app_volley.istilahN.NADP;

/**
 * Created by AHMAD FAUZI RAHMAN on 26/06/2016.
 */
public class P extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        String[] Listrs = new String[]{"pH","pH Meter"};
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
            if (pilihan.equals("pH")) {
                i = new Intent(this,pH.class);
            } else if (pilihan.equals("pH Meter")) {
                i = new Intent(this,pHMeter.class);
            }
            startActivity(i);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}