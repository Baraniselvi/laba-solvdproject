package com.solvd.laba.bankproject.Accounts;

import com.solvd.laba.bankproject.Customer;
import com.solvd.laba.bankproject.Person;

public class SavingsAccount extends Account {

    private double interestrate;

    public SavingsAccount(String accountnumber, double balance, double interestrate) {
        super(accountnumber, balance);
        this.interestrate = interestrate;
    }

    public double getInterestrate() {
        return interestrate;
    }

    public void setInterestrate(double interestrate) {
        this.interestrate = interestrate;
    }

}
