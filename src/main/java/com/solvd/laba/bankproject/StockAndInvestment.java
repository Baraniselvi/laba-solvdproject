package com.solvd.laba.bankproject;

import java.util.Scanner;

public class StockAndInvestment {

    public double stocknumber;
    private double priceperunit;
    private double totalstockvalue;



    public  StockAndInvestment(double priceperunit, double stocknumber)

    {
        this.priceperunit =priceperunit;
        this.stocknumber = stocknumber;


    }


    public void buystock()
    {
        System.out.println();
        totalstockvalue = stocknumber * priceperunit;
        System.out.println("Totalstockvalue " + totalstockvalue);




    }


    }




