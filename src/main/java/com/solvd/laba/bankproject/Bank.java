package com.solvd.laba.bankproject;

import java.util.Date;

public abstract class Bank {

    private String customername;


    private int accountnumber;
    private double balance;
    public String bankname;


    protected String accounttype;


    public Bank(String customername, int accountnumber) {

        this.customername = customername;
        this.accountnumber = accountnumber;
    }

    public abstract void createaccount();

    public abstract void currentbalance();

    public abstract void withdraw();

    public abstract void deposit();


}
