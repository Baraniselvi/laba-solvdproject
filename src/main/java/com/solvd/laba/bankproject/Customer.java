package com.solvd.laba.bankproject;

import java.time.LocalDate;
import java.util.Date;




public class Customer extends Bank {


    private String customername;

    private int accountnumber;



    private double balance;

    private double amount;
    ;


    public Customer(String customername, int accountnumber, double balance,double amount) {
        super(customername, accountnumber);
        System.out.println("Customer name: "+ customername + "  Accountnumber: " +accountnumber);
        this.balance = balance;
        this.amount =amount;

    }

    @Override
    public void createaccount()
    {

        System.out.println("KYC(know your customer must be cleared for opening Account)");
        System.out.println();

        }




    @Override
    public void currentbalance() {
        System.out.println();
        if (balance<0)
        {

            System.out.println("Zero Balance in your account");
        }
            
        else

        {
            balance = balance;
            System.out.println("Current Balance : " + balance);
        }


    }

    @Override
    public void withdraw() {
        System.out.println();
        System.out.println("Enter the amount to be withdrawn");
        if(amount>0 && amount <=balance)
        {
            balance = balance - amount;
            System.out.println("Amount withdrawn : " + amount + " Balance after withdrawal : " + balance);
        }


    }

    @Override
    public void deposit() {
        System.out.println();
        System.out.println("Enter the amount to be deposited");
        balance = balance + amount;
        System.out.println("Amount deposited : " + amount  + "  New Balance  :" +  balance ) ;

    }



}


