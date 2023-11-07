package com.solvd.laba.bankproject.Accounts;

import com.solvd.laba.bankproject.Customer;
import com.solvd.laba.bankproject.CustomerService;
import com.solvd.laba.bankproject.Payments;
import com.solvd.laba.bankproject.Person;

import java.time.LocalDate;


public  class Account implements Payments ,CustomerService {

    private String  accountnumber;

    private double balance;

    public static final double minimumBalance = 0.0;


    public Account(String accountnumber, double balance) {
        this.accountnumber = accountnumber;
        this.balance = balance;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

       public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public void printReceipt() {
        System.out.println("Account number :" + accountnumber + " Balance " + balance);

    }


    @Override
    public void customerInquiry(String inquiry) {
        System.out.println("Please write your inquiries");

    }

    @Override
    public void solvedInquiry(String issue) {
        System.out.println("This inquiry is solved");

    }
}
