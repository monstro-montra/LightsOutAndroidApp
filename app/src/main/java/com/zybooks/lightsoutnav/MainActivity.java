package com.zybooks.lightsoutnav;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//controller class along with ColorFragment, HelpFragment, and GameFragment

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}