package com.dradns;

public class TaxCalculator2019 implements TaxCalculator{
    private int taxableIncome;

    public TaxCalculator2019(int taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calcTax(){
        return taxableIncome * 0.2;
    }

    public void setTaxableIncome(int taxableIncome) {
        this.taxableIncome = taxableIncome;
    }
}
