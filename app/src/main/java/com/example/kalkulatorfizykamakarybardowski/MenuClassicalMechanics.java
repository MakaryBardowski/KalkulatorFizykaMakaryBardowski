package com.example.kalkulatorfizykamakarybardowski;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuClassicalMechanics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_classical_mechanics);
    }

    public void ChooseWaves(View view){
        Intent intent = new Intent(this, Waves.class);
        startActivity(intent);
        finish();
    }
}