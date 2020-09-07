package com.example.kalkulatorfizykamakarybardowski;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle(R.string.menu_main);


    }

    public void ChooseClassicalMechanics(View view){
        Intent intent = new Intent(this, MenuClassicalMechanics.class);
        startActivity(intent);
        finish();
    }
}