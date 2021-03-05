package com.example.tituriols2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate:invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: invoked");
    }
}