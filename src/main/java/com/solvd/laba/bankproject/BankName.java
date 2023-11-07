package com.solvd.laba.bankproject;

public class BankName {

    private String name;

    public BankName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    final void WelcomeMesage() {
        System.out.println("Welcome to xxxx bank");
    }
}
