package com.example.brsi2020jaipur;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.appcompat.app.AppCompatActivity;

public class splashscreen extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this,MainActivity.class));
        finish();


    }
}
