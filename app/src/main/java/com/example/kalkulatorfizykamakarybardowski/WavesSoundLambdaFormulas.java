package com.example.kalkulatorfizykamakarybardowski;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class WavesSoundLambdaFormulas extends AppCompatActivity {
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waves_sound_lambda_formulas);

        if(FormulaVariables.AllFormulaVariables.getChosenLambdaFormula()== 1){
            imageView = findViewById(R.id.lambdaFormula1);
            imageView.setImageResource(R.drawable.lambda_zrodlo_sie_zbliza_do_obserwatora_zaznaczony);

        } else if(FormulaVariables.AllFormulaVariables.getChosenLambdaFormula()== 2){
            imageView = findViewById(R.id.lambdaFormula2);
            imageView.setImageResource(R.drawable.lambda_zrodlo_sie_oddala_od_obserwatora_zaznaczony);

        } else if(FormulaVariables.AllFormulaVariables.getChosenLambdaFormula()== 3){
            imageView = findViewById(R.id.lambdaFormula3);
            imageView.setImageResource(R.drawable.lambda_ogolny_zaznaczony);
        }


    }

    public void ChooseFormula1(View view){
        FormulaVariables.AllFormulaVariables.setChosenLambdaFormula(1);

        imageView = findViewById(R.id.lambdaFormula1);
        imageView.setImageResource(R.drawable.lambda_zrodlo_sie_zbliza_do_obserwatora_zaznaczony);

        imageView = findViewById(R.id.lambdaFormula2);
        imageView.setImageResource(R.drawable.lambda_zrodlo_sie_oddala_od_obserwatora);

        imageView = findViewById(R.id.lambdaFormula3);
        imageView.setImageResource(R.drawable.lambda_ogolny);
    }

    public void ChooseFormula2(View view){
        FormulaVariables.AllFormulaVariables.setChosenLambdaFormula(2);

        imageView = findViewById(R.id.lambdaFormula1);
        imageView.setImageResource(R.drawable.lambda_zrodlo_sie_zbliza_do_obserwatora);

        imageView = findViewById(R.id.lambdaFormula2);
        imageView.setImageResource(R.drawable.lambda_zrodlo_sie_oddala_od_obserwatora_zaznaczony);

        imageView = findViewById(R.id.lambdaFormula3);
        imageView.setImageResource(R.drawable.lambda_ogolny);
    }

    public void ChooseFormula3(View view){
        FormulaVariables.AllFormulaVariables.setChosenLambdaFormula(3);

        imageView = findViewById(R.id.lambdaFormula1);
        imageView.setImageResource(R.drawable.lambda_zrodlo_sie_zbliza_do_obserwatora);

        imageView = findViewById(R.id.lambdaFormula2);
        imageView.setImageResource(R.drawable.lambda_zrodlo_sie_oddala_od_obserwatora);

        imageView = findViewById(R.id.lambdaFormula3);
        imageView.setImageResource(R.drawable.lambda_ogolny_zaznaczony);
    }
}