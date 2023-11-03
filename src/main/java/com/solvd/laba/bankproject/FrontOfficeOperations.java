package com.solvd.laba.bankproject;

public class FrontOfficeOperations {

    private int accountnumber;

    private String checknumber;

    private double amount;

    private double balance;

    public FrontOfficeOperations(int accountnumber, String checknumber, double amount) {
        this.accountnumber = accountnumber;
        this.checknumber = checknumber;
        this.amount = amount;

    }

    public void checkdeposit() {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("check deposited amount" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }


}
