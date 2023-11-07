package com.solvd.laba.bankproject;

import com.solvd.laba.bankproject.Accounts.Account;


import java.util.Arrays;

public class Customer extends Person {
    private Account[] accounts;
    private Transaction[] transactions;

    public Customer(String firstname, String lastname, Account[] accounts, Transaction[] transactions) {
        super(firstname, lastname);
        this.accounts = accounts;
        this.transactions = transactions;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public Transaction[] getTransactions() {
        return transactions;
    }

    public void setTransactions(Transaction[] transactions) {
        this.transactions = transactions;
    }

    @Override
    public String getFullNAME() {
        return firstname + lastname;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "accounts=" + Arrays.toString(accounts) +
                ", transactions=" + Arrays.toString(transactions) +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer customer)) return false;
        if (!super.equals(o)) return false;
        return Arrays.equals(accounts, customer.accounts) && Arrays.equals(transactions, customer.transactions);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(accounts);
        result = 31 * result + Arrays.hashCode(transactions);
        return result;
    }
}
