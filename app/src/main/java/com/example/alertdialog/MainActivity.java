package com.example.alertdialog;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder adb;
    Random rnd=new Random();
    LinearLayout ll;

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menu){
        String st=menu.getTitle().toString();
        if (st.equals("credits")){
            Intent si=new Intent(this,credits.class);
            startActivity(si);
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll=(LinearLayout) findViewById(R.id.ll);
    }

    public void mssg(View view) {
        adb=new AlertDialog.Builder(this);
        adb.setTitle("1st option");
        adb.setMessage("this is a simple alert");
        AlertDialog ad=adb.create();
        ad.show();
    }


    public void pic(View view) {
        adb=new AlertDialog.Builder(this);
        adb.setTitle("2nd option");
        adb.setIcon(R.drawable.flower1);
        adb.setMessage("this is a simple alert");
        AlertDialog ad=adb.create();
        ad.show();
    }

    public void piclose(View view) {
        adb=new AlertDialog.Builder(this);
        adb.setTitle("3rd option");
        adb.setIcon(R.drawable.flower1);
        adb.setMessage("this is a simple alert");
        adb.setNegativeButton("close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog ad=adb.create();
        ad.show();
    }

    public void bckrandom(View view) {
        adb.setTitle("4th option");
        adb.setMessage("this is a simple alert");
        adb.setPositiveButton("random color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                int color= Color.argb(255,rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256));
                ll.setBackgroundColor(color);
            }
        });
        adb.setNegativeButton("close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog ad=adb.create();
        ad.show();
    }

    public void bckground(View view) {
        adb.setTitle("5th option");
        adb.setMessage("this is a simple alert");
        adb.setPositiveButton("random color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                int color= Color.argb(255,rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256));
                ll.setBackgroundColor(color);
            }
        });
        adb.setNeutralButton("white", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ll.setBackgroundColor(Color.WHITE);
            }
        });
        adb.setNegativeButton("close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog ad=adb.create();
        ad.show();
    }
}
