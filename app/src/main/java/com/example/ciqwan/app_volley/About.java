package com.example.ciqwan.app_volley;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * Created by AHMAD FAUZI RAHMAN on 29/06/2016.
 */
public class About extends TabActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec kimia1 = tabHost.newTabSpec("FAUZI");
        kimia1.setIndicator("FAUZI", getResources().getDrawable(R.drawable.ic_kimia1));
        Intent ubuntuIntent = new Intent(this,kimia1.class);
        kimia1.setContent(ubuntuIntent);

        TabHost.TabSpec kimia2 = tabHost.newTabSpec("FITRI");
        kimia2.setIndicator("FITRI", getResources().getDrawable(R.drawable.ic_kimia3));
        Intent mandrivaIntent = new Intent(this, kimia2.class);
        kimia2.setContent(mandrivaIntent);

        TabHost.TabSpec kimia3 = tabHost.newTabSpec("ANGGA");
        kimia3.setIndicator("ANGGA", getResources().getDrawable(R.drawable.ic_kimia3));
        Intent archIntent = new Intent(this, kimia3.class);
        kimia3.setContent(archIntent);

        TabHost.TabSpec kimia4 = tabHost.newTabSpec("KHAIRUN");
        kimia4.setIndicator("KHAIRUN", getResources().getDrawable(R.drawable.ic_kimia3));
        Intent ais = new Intent(this, kimia4.class);
        kimia4.setContent(ais);

        TabHost.TabSpec kimia5 = tabHost.newTabSpec("OLVIA APRILIANI");
        kimia5.setIndicator("OLIVIA APRILIANI", getResources().getDrawable(R.drawable.ic_kimia3));
        Intent oliv = new Intent(this, kimia5.class);
        kimia5.setContent(oliv);

        tabHost.addTab(kimia1);
        tabHost.addTab(kimia2);
        tabHost.addTab(kimia3);
        tabHost.addTab(kimia4);
        tabHost.addTab(kimia5);

    }
}