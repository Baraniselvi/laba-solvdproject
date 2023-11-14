package com.solvd.laba.bankproject.transactions;

import com.solvd.laba.bankproject.person.Person;


import java.time.LocalDate;
import java.util.Date;

public class Transaction {

    private Transaction transaction;

    private double balance;


    public Transaction(Transaction transaction, double balance) {
        this.transaction = transaction;
        this.balance = balance;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }
}