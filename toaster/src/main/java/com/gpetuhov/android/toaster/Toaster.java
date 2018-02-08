package com.gpetuhov.android.toaster;


import android.content.Context;
import android.widget.Toast;

// Shows Toast message
public class Toaster {

    public static void show(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
