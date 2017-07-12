package com.opcv.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.opcv.R;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {
    // Name of the native dynamic libraries to load:
    private static final String NATIVE_LIB_SAMPLE = "OPENCVLIB";

    static {
        System.loadLibrary(NATIVE_LIB_SAMPLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent i2 = new Intent(MenuActivity.this,
                OpenCVModule.class);
        i2.putExtra("fl",3.5f);
        startActivity(i2);
        finish();

                

    }


}
