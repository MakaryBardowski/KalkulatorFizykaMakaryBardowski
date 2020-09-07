package com.example.kalkulatorfizykamakarybardowski;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Waves extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waves);
    }

    public void ChooseSound(View view){
        Intent intent = new Intent(this, WavesSound.class);
        startActivity(intent);
        finish();
    }
}