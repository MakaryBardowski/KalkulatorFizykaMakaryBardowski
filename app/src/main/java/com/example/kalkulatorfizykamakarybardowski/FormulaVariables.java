package com.example.kalkulatorfizykamakarybardowski;

public class FormulaVariables {

    private int chosenLambdaFormula;


    public FormulaVariables(int chosenLambdaFormula) {
        this.chosenLambdaFormula = chosenLambdaFormula;
    }

    public int getChosenLambdaFormula() {
        return chosenLambdaFormula;
    }

    public void setChosenLambdaFormula(int chosenLambdaFormula) {
        this.chosenLambdaFormula = chosenLambdaFormula;
    }




    static FormulaVariables AllFormulaVariables = new FormulaVariables(0);
}
