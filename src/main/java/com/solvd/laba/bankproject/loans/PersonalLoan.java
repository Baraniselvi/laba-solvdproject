package com.solvd.laba.bankproject.loans;

import com.solvd.laba.bankproject.*;
import com.solvd.laba.bankproject.Accounts.Account;
import com.solvd.laba.bankproject.Accounts.Interest;

public class PersonalLoan extends BankName implements Loan, Interest {

    private double balance;

    private double interestrate;

    public PersonalLoan(String name, double balance, double interestrate) {
        super(name);
        this.balance = balance;
        this.interestrate = interestrate;
    }

    @Override
    public void checkEligibilty() {
        System.out.println("Credit score will be checked");

    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan Applying for " + amount);

    }

    @Override
    public double calculateInterest() {
        double interest = balance * interestrate;
        System.out.println("Interest calculated: " + interest);
        return interest;


    }
}


