package com.example.daggertest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {
    private final static String TAG ="MainActivity";
    @Inject
    Coffee coffee, coffee2;

    Application getApplication;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AppComponent Component =((MainApplication)getApplication).getAppComponent();

        CoffeeComponent coffeeComponent=Component.getCoffeeComponentBuilder().milk(4).sugar(5).build();
        coffeeComponent.inject(this);

       Log.d(TAG, "SARA onCreate: " +
               "\n coffee1: "+coffee+
               "\n coffee2: "+coffee2+
               "\n river for coffee1: "+coffee.river+
               "\n river for coffee2: "+coffee2.river);


    }



}