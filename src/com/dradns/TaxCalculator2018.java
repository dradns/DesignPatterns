package com.dradns;

public class TaxCalculator2018 implements TaxCalculator{
    private int taxableIncome;

    public TaxCalculator2018(int taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calcTax(){
        return taxableIncome * 0.4;
    }
}
