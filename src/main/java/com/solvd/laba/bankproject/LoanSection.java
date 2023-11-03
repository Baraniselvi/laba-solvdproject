package com.solvd.laba.bankproject;

public class LoanSection {

    public double principalamount;
    protected int  loaninterestrate;

    protected int creditscore;

    public  int numberofmonths ;







    public static void calculateinterest(double principalamount,int loaninterestrate)

    {
        double calculate = (principalamount * loaninterestrate * 12)/100;
        System.out.println("Monthly EMI is"  +  calculate);

    }

    public void personalloan() {
        System.out.println("Personal loan interest as per market rate");

    }

    public void housingloan() {
        System.out.println("Housing loan interest as per floating rate");

    }



}
