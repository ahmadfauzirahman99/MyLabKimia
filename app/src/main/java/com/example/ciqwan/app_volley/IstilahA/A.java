package com.example.ciqwan.app_volley.IstilahA;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by AHMAD FAUZI RAHMAN on 26/06/2016.
 */
public class A extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        String[] Listrs = new String[]{"Unsur Kimia","AG°", "2-Deoksi-D-Ribosa", "Accumulator", "Adenosin", "Adsorben", "Adsorpsi",
                "Aerob","Aerosol Cair","Aerosol Padat","Affinitas Elektron","Air","Aki","Aldolase Fruktosa Difosfat","Aldosa",
                "Alkalosis","Alkana","Alkanal","Alkanol","Alkanon","Alkena","Alkil Alkanoat","Alkohol Primer","Alkohol Sekunder"
                ,"Alkohol Tersier","Alkoksi Alkana","Alkuna","Amfoterik","Amilase"};
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
            if (pilihan.equals("AG°")) {
                i = new Intent(this,AG.class);
            } else if (pilihan.equals("2-Deoksi-D-Ribosa")) {
                i = new Intent(this,DeoksiDRibosa.class);
            }else if(pilihan.equals("Accumulator")){
                i=new Intent(this,Accumulator.class);
            }else if(pilihan.equals("Adenosin")) {
                i = new Intent(this,Adenosin.class);
            }else if(pilihan.equals("Adsorben")) {
                i = new Intent(this,Adsorben.class);
            }else if(pilihan.equals("Adsorpsi")) {
                i = new Intent(this, Adsorpsi.class);
            }else if(pilihan.equals("Aerob")) {
                i = new Intent(this, Aerob.class);
            }else if(pilihan.equals("Aerosol Cair")) {
                i = new Intent(this, AerosolCair.class);
            }else if(pilihan.equals("Aerosol Padat")) {
                i = new Intent(this, AerosolPadat.class);
            }else if(pilihan.equals("Affinitas Elektron")) {
                i = new Intent(this, AffinitasElektron.class);
            }else if(pilihan.equals("Air")) {
                i = new Intent(this, Air.class);
            }else if(pilihan.equals("Aki")) {
                i = new Intent(this, Aki.class);
            }else if(pilihan.equals("Aldolase Fruktosa Difosfat")) {
                i = new Intent(this, AldolaseFruktosaDifosfat.class);
            }else if(pilihan.equals("Aldosa")) {
                i = new Intent(this, Aldosa.class);
            }else if(pilihan.equals("Alkalosis")) {
                i = new Intent(this, Alkalosis.class);
            }else if(pilihan.equals("Alkana")) {
                i = new Intent(this, Alkana.class);
            }else if(pilihan.equals("Alkanal")) {
                i = new Intent(this, Alkanal.class);
            }else if(pilihan.equals("Alkanol")) {
                i = new Intent(this, Alkanol.class);
            }else if(pilihan.equals("Alkanon")) {
                i = new Intent(this, Alkanon.class);
            }else if(pilihan.equals("Alkena")) {
                i = new Intent(this, Alkena.class);
            }else if(pilihan.equals("Alkil Alkanoat")) {
                i = new Intent(this, AlkilAlkanoat.class);
            }else if(pilihan.equals("Alkohol Primer")) {
                i = new Intent(this, AlkoholPrimer.class);
            }else if(pilihan.equals("Alkohol Sekunder")) {
                i = new Intent(this, AlkoholSekunder.class);
            }else if(pilihan.equals("Alkohol Tersier")) {
                i = new Intent(this, AlkoholTersier.class);
            }else if(pilihan.equals("Alkoksi Alkana")) {
                i = new Intent(this, AlkoksiAlkana.class);
            }else if(pilihan.equals("Alkuna")) {
                i = new Intent(this, Alkuna.class);
            }else if(pilihan.equals("Amfoterik")) {
                i = new Intent(this, Amfoterik.class);
            }else if(pilihan.equals("Amilase")) {
                i = new Intent(this, Amilase.class);
            }
            startActivity(i);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
