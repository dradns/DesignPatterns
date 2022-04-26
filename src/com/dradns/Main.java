package com.dradns;

public class Main {

    public static void main(String[] args){
//        drawUIControl(new TextBox());
//        drawUIControl(new CheckBox());
//        var textB = new TextBox();
//        UIControl ui;
//        ui = new UIControl();
        var calculator = new TaxCalculator2018(100);
        var calculator2 = new TaxCalculator2019(100);

        var report = new TaxReport1(calculator);
        System.out.println(report.makeReport());

        report.setCalculator(calculator2);
        System.out.println(report.makeReport());

        System.out.println(report.make2(calculator2));
    }
}
