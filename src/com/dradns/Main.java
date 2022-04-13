package com.dradns;

public class Main {

    public static void main(String[] args){
        var account = new Account();
        account.deposit(10);
        account.getBalance();
        account.withdraw(5);
        account.getBalance();
    }
}
