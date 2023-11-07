package com.solvd.laba.bankproject.Accounts;

import com.solvd.laba.bankproject.Customer;

public class CheckingAccount extends Account {

    private double overdraftlimit;

    public CheckingAccount(String accountnumber, double balance, double overdraftlimit) {
        super(accountnumber, balance);
        this.overdraftlimit = overdraftlimit;
    }

    public double getOverdraftlimit() {
        return overdraftlimit;
    }

    public void setOverdraftlimit(double overdraftlimit) {
        this.overdraftlimit = overdraftlimit;
    }


}
