package com.example.kalkulatorfizykamakarybardowski;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class WavesSound extends AppCompatActivity {
EditText editTekst;
double equals;
String equalsString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waves_sound);
    }

    public void ChooseReminder(View view){
        Intent intent = new Intent(this,WavesSoundReminder.class);
        startActivity(intent);
//        finish();
    }

    public void ChooseReminderLambdaFormulas(View view){
        Intent intent = new Intent(this,WavesSoundLambdaFormulas.class);
        startActivity(intent);
//        finish();
    }

    public void Calculate(View view){
        editTekst = findViewById(R.id.lambdaInput);
        String lambdaString = editTekst.getText().toString();
        double lambda = Double.parseDouble(lambdaString);

        editTekst =  findViewById(R.id.velocityInput);
        String velocityString = editTekst.getText().toString();
        double velocity = Double.parseDouble(velocityString);

        editTekst =  findViewById(R.id.velocitySourceInput);
        String velocitySourceString = editTekst.getText().toString();
        double velocitySource = Double.parseDouble(velocitySourceString);

        editTekst =  findViewById(R.id.periodInput);
        String periodString = editTekst.getText().toString();
        double period = Double.parseDouble(periodString);

        editTekst =  findViewById(R.id.frequencySourceInput);
        String frequencySourceString = editTekst.getText().toString();
        double frequencySource = Double.parseDouble(frequencySourceString);

        if(FormulaVariables.AllFormulaVariables.getChosenLambdaFormula() == 1){
            editTekst = findViewById(R.id.lambdaInput);
            editTekst.setText((String.valueOf((velocity - velocitySource)/frequencySource)));
        }



//todo: wzory na lambde maja zly mianownik w grafice


    }
}