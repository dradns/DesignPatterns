package com.dradns;

public class UIControl {
    private boolean isEnabled = true;

    public UIControl(){
        System.out.println("its UI control");
    }

    public void enable(){
        this.isEnabled = true;
        System.out.println("Enabled");
    }

    private void switcher(){
        this.isEnabled = !isEnabled;
        System.out.println(isEnabled);
    }

//    public abstract void draw();
}
