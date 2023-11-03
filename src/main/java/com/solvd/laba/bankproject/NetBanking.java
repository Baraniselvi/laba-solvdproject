package com.solvd.laba.bankproject;

import java.time.LocalDate;
import java.util.Date;

public class NetBanking {

    private double amount;

    private double balance;

    public Date date;

    private int targetaccountnumber;

    private String customer;


    public boolean isValidaccount()
    {
      return true;
    }
    public void transfer(int targetaccountnumber,double amount,double balance)
    {
        this.targetaccountnumber = targetaccountnumber;
        this.amount = amount;
        this.balance =balance;
      balance = balance - amount;
      System.out.println("Transfer Successful and newbalance is  :"  +  balance  );

    }
    public void customertransactionhistory()
    {
        System.out.println("Transaction History and statements");
    }

    public void currdate()

    {
        LocalDate currentdate = LocalDate.now();
        System.out.println(currentdate);
    }
}
