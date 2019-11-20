package com.example.alertdialog;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder adb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mssg(View view) {
        adb=new AlertDialog.Builder(this);
        adb.setMessage("this is a simple alert");
        AlertDialog ad=adb.create();
        ad.show();
    }

    public void pic(View view) {
    }
}
