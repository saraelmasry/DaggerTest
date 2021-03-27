package com.example.daggertest;

import android.util.Log;

import androidx.annotation.LongDef;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@ActivityScope
public class Coffee {
    private static final String TAG = "Coffee";


    int sugar;
    int milk;
    River river;
    @Inject
    Farm farm;


    @Inject
    public Coffee(River river , @Sugar int sugar ,@Milk int milk) {
        this.river=river;
        this.sugar=sugar;
        this.milk=milk;

    }
    /*
    @Inject
    public Coffee(River river , @Named("sugar") int sugar ,@Named("milk") int milk) {
        this.river=river;
        this.sugar=sugar;
        this.milk=milk;

    }

     */

    public String gtCoffeeCup(){
        return river.getWater()+ "+" + farm.getBeans()+"Sugar: " +sugar+"Milk: " +milk;
    }

    @Inject
    public void ConnectElectric(){
        Log.d(TAG, " SARA ConnectElectric:  Connecting ");

    }
}
