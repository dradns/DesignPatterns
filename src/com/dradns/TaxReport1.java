package com.dradns;

public class TaxReport1 {
    private TaxCalculator calculator;

    public TaxReport1(TaxCalculator calculator) {
        this.calculator = calculator;
    }
    
    public String makeReport(){
        double c = calculator.calcTax();
        return "Its a report = " + c;
    }
}
