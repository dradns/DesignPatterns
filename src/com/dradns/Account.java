package com.dradns;

public class Account {
    private float balance;

    public void deposit(float amount){
        if(amount >= 0)
            this.balance = this.balance + amount;
    }

    public void withdraw(float amount){
        if(amount >= 0)
            this.balance -= amount;
    }

    public float getBalance(){
        System.out.println(balance);
        return 0;
    }
}
