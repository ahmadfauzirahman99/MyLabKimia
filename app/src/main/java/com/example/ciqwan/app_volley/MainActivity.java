package com.example.ciqwan.app_volley;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout dr;
    private Toolbar tl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton add = (ImageButton) findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showtambah();
            }
        });
        tl = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(tl);
        ProsesNavigasi();



    }

    private void showtambah() {
        Intent i = new Intent(this,BiodataPenggunaAplikasikimia.class);
        startActivity(i);
    }

    public void ProsesNavigasi() {
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        assert navigationView != null;
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {

                int id = menuItem.getItemId();

                switch (id) {
                    case R.id.home:
                        Toast.makeText(getApplicationContext(), "Kamus", Toast.LENGTH_SHORT).show();
                        dr.closeDrawers();
                        Intent i = new Intent(MainActivity.this,Home.class);
                        startActivity(i);
                        break;
                    case R.id.settings:
                        Toast.makeText(getApplicationContext(), "Rumus", Toast.LENGTH_SHORT).show();
                        i = new Intent(MainActivity.this, Penjelasan.class);
                        startActivity(i);
                        break;
                    case R.id.trash:
                        Toast.makeText(getApplicationContext(), "Soal Quis", Toast.LENGTH_SHORT).show();
                        i = new Intent(MainActivity.this,SoalQuis1.class);
                        startActivity(i);
                        break;
                    case R.id.Biodata:
                        Toast.makeText(getApplicationContext(), "Isi Biodata", Toast.LENGTH_SHORT).show();
                        i = new Intent(MainActivity.this,BiodataPenggunaAplikasikimia.class);
                        startActivity(i);
                        break;
                    case R.id.logout:
                        Toast.makeText(getApplicationContext(), "Logout", Toast.LENGTH_SHORT).show();
                        i = new Intent(MainActivity.this, Login.class);
                        startActivity(i);
                        break;
                    case R.id.About:
                        Toast.makeText(getApplicationContext(), "TEAM", Toast.LENGTH_SHORT).show();
                        i = new Intent(MainActivity.this, LoginDulu.class);
                        startActivity(i);
                        break;


                }
                return true;
            }
        });
        View header = navigationView.getHeaderView(0);
        TextView tv_email = (TextView) header.findViewById(R.id.tv_email);
        tv_email.setText("Kel.7(Aplikasi Kimia Mobile)");
        dr = (DrawerLayout) findViewById(R.id.drawer);

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, dr, tl, R.string.drawer_open, R.string.drawer_close) {

            @Override
            public void onDrawerClosed(View v) {
                super.onDrawerClosed(v);
            }

            @Override
            public void onDrawerOpened(View v) {
                super.onDrawerOpened(v);
            }
        };
        dr.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
    }
}
