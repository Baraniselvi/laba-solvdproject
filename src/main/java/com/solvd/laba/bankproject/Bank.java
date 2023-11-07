package com.solvd.laba.bankproject;

public class Bank {

    private BankName[] bankname;
    private Customer[] customer;

    private Location[] location;

    private Employee[] employee;

    public Bank(BankName[] bankname, Customer[] customer, Location[] location, Employee[] employee) {
        this.bankname = bankname;
        this.customer = customer;
        this.location = location;
        this.employee = employee;
    }

    public BankName[] getBankname() {
        return bankname;
    }

    public void setBankname(BankName[] bankname) {
        this.bankname = bankname;
    }

    public Customer[] getCustomer() {
        return customer;
    }

    public void setCustomer(Customer[] customer) {
        this.customer = customer;
    }

    public Location[] getLocation() {
        return location;
    }

    public void setLocation(Location[] location) {
        this.location = location;
    }

    public Employee[] getEmployee() {
        return employee;
    }

    public void setEmployee(Employee[] employee) {
        this.employee = employee;
    }
}