package com.example.daggertest;

import android.util.Log;

import javax.inject.Inject;

public class River {
    private static final String TAG = "River";
    //just view
    public River() {
        Log.d(TAG, "SARA River: RIVER ");
    }

    public String getWater(){
        return "Water";
    }
}
