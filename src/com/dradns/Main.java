package com.dradns;

public class Main {

    public static void main(String[] args){
//        drawUIControl(new TextBox());
//        drawUIControl(new CheckBox());
//        var textB = new TextBox();
//        UIControl ui;
//        ui = new UIControl();
        var calculator = new TaxCalculator2018(100);
        var report = new TaxReport1(calculator);
        System.out.println(report.makeReport());
    }
}
