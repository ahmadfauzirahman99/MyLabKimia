package com.example.ciqwan.app_volley;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.ciqwan.app_volley.IstilahA.A;
import com.example.ciqwan.app_volley.IstilahB.B;
import com.example.ciqwan.app_volley.istilahE.E;
import com.example.ciqwan.app_volley.istilahC.C;
import com.example.ciqwan.app_volley.istilahD.D;
import com.example.ciqwan.app_volley.istilahF.F;
import com.example.ciqwan.app_volley.istilahG.G;
import com.example.ciqwan.app_volley.istilahH.H;
import com.example.ciqwan.app_volley.istilahI.I;
import com.example.ciqwan.app_volley.istilahJ.J;
import com.example.ciqwan.app_volley.istilahK.K;
import com.example.ciqwan.app_volley.istilahL.L;
import com.example.ciqwan.app_volley.istilahM.M;
import com.example.ciqwan.app_volley.istilahN.N;
import com.example.ciqwan.app_volley.istilahO.O;
import com.example.ciqwan.app_volley.istilahP.P;
import com.example.ciqwan.app_volley.istilahQ.Q;
import com.example.ciqwan.app_volley.istilahR.R1;
import com.example.ciqwan.app_volley.istilahS.S;
import com.example.ciqwan.app_volley.istilahT.T;
import com.example.ciqwan.app_volley.istilahV.V;
import com.example.ciqwan.app_volley.istilahw.W;
import com.example.ciqwan.app_volley.istilahz.Z;

/**
 * Created by AHMAD FAUZI RAHMAN on 18/06/2016.
 */
public class Home extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        String[] Listrs = new String[]{"Unsur Kimia","A", "B", "C", "D", "E", "F","G","H","I","J","K","L","M","N",
                "O","P","Q","R","S","T","U","V","W","X","Y","Z"};
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
            if (pilihan.equals("A")) {
                i = new Intent(this,A.class);
            } else if (pilihan.equals("B")) {
                i = new Intent(this,B.class);
            }else if(pilihan.equals("C")){
                i=new Intent(this,C.class);
            }else if(pilihan.equals("D")) {
                i = new Intent(this, D.class);
            }else if(pilihan.equals("E")) {
                i = new Intent(this, E.class);
            }else if(pilihan.equals("F")) {
                i = new Intent(this, F.class);
            }else if(pilihan.equals("G")) {
                i = new Intent(this, G.class);
            }else if(pilihan.equals("H")) {
                i = new Intent(this, H.class);
            }else if(pilihan.equals("I")) {
                i = new Intent(this, I.class);
            }else if(pilihan.equals("J")) {
                i = new Intent(this, J.class);
            }else if(pilihan.equals("K")) {
                i = new Intent(this, K.class);
            }else if(pilihan.equals("L")) {
                i = new Intent(this, L.class);
            }else if(pilihan.equals("M")) {
                i = new Intent(this, M.class);
            }else if(pilihan.equals("N")) {
                i = new Intent(this, N.class);
            }else if(pilihan.equals("O")) {
                i = new Intent(this, O.class);
            }else if(pilihan.equals("P")) {
                i = new Intent(this, P.class);
            }else if(pilihan.equals("Q")) {
                i = new Intent(this, Q.class);
            }else if(pilihan.equals("R")) {
                i = new Intent(this, R1.class);
            }else if(pilihan.equals("S")) {
                i = new Intent(this, S.class);
            }else if(pilihan.equals("T")) {
                i = new Intent(this, T.class);
            }else if(pilihan.equals("U")) {
                i = new Intent(this, U.class);
            }else if(pilihan.equals("V")) {
                i = new Intent(this, V.class);
            }else if(pilihan.equals("W")) {
                i = new Intent(this, W.class);
            }else if(pilihan.equals("X")) {
                i = new Intent(this, X.class);
            }else if(pilihan.equals("Y")) {
                i = new Intent(this, Y.class);
            }else if(pilihan.equals("Z")) {
                i = new Intent(this, Z.class);
            }
            startActivity(i);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
