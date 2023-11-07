package com.solvd.laba.bankproject;


import com.solvd.laba.bankproject.Accounts.Account;
import com.solvd.laba.bankproject.Accounts.SavingsAccount;
import com.solvd.laba.bankproject.loans.Loan;
import com.solvd.laba.bankproject.loans.PersonalLoan;

public class main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Jonathan","Henry", new Account[0],new Transaction[0]);
        String fullname =customer1.getFullNAME();
        System.out.println("Customer Fullname" + fullname);

        Employee employee1 = new Employee("Drake","kristen",new Location("Frisco","USA","187654333"),"Associate",22233);


        SavingsAccount savingsAccount = new SavingsAccount("12323434",13443,3.1);
        System.out.println("Balance in Savings Account" +savingsAccount.getBalance());


        PersonalLoan personalLoan = new PersonalLoan("Chase",7980,1.7);
        personalLoan.checkEligibilty();
        personalLoan.calculateInterest();
        personalLoan.applyForLoan(10000);

       Account account = new Account("34444",1000);
       account.checkBalance();
       account.printReceipt();







    }

}
