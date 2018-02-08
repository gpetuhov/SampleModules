package com.gpetuhov.android.mainactivitylibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


// This activity class is declared inside Android library module
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
