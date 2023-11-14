package com.solvd.laba.bankproject.transactions;

import com.solvd.laba.bankproject.person.Customer;
import com.solvd.laba.bankproject.person.Person;

public interface Payments {


    void makePayment(Person customer, double amount);
}
