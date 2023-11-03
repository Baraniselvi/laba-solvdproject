package com.solvd.laba.bankproject;

import java.util.Scanner;

public  class AccountType {

    protected int accountname;

    protected double balance;

    private double depositamount;

    private double interestrate;

    private double interestamount;

    public int term;





    public void calculateinterest()

    {
        System.out.println();
        System.out.println("To calculate interest please enter the following");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal amount");
         double pa = sc.nextDouble();
        System.out.println(pa);
        System.out.println("Enter the interest rate");
        double in = sc.nextDouble();
        System.out.println(in);

        System.out.println("Enter the term");

        int tm = sc.nextInt();
        System.out.println(tm);
        System.out.println();
        double interestamount = (pa*in*tm)/100 ;
        System.out.println("Interest for Savings Account " + interestamount);
    }


}