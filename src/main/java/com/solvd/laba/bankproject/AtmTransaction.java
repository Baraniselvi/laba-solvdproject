package com.solvd.laba.bankproject;

public class AtmTransaction {

    private double balance;

    private double amount;


    public AtmTransaction(double initialbalance, double amount) {
        this.balance = initialbalance;
    }

    public void checkbalance() {
        System.out.println("your balance " + balance);
    }

    public void withdraw() {
        if (amount < 0) {
            System.out.println("Insufficient amount");
        }
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Balance after withdraw" + balance);
        }
    }


}
