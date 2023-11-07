package com.solvd.laba.bankproject;

import com.solvd.laba.bankproject.Accounts.Account;


import java.time.LocalDate;

public class Transaction {

    private Transaction transaction;
    protected Person customerName;
    private String type;
    private double amount;
    public LocalDate transactionDate;

    public Transaction(Transaction transaction, Person customerNamename, String type, double amount) {
        this.transaction = transaction;
        this.customerName = customerName;
        this.type = type;
        this.amount = amount;
        this.transactionDate = LocalDate.now();
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


}