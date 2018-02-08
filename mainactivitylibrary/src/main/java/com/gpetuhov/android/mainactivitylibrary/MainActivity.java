package com.gpetuhov.android.mainactivitylibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gpetuhov.android.messageprovider.MessageProvider;
import com.gpetuhov.android.toaster.Toaster;


// This activity class is declared inside Android library module
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();

        String message = new MessageProvider(1).getMessage();
        Toaster.show(this, message);
    }
}
