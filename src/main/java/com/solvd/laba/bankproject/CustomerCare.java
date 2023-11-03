package com.solvd.laba.bankproject;

import java.util.Scanner;

public class CustomerCare {

    private static int customercarenumber;

    public static void setCustomercarenumber(int customercarenumber) {
        customercarenumber = customercarenumber;
    }

    public void options() {
        System.out.println("Enter the options for inquiries");
        while (true) {
            System.out.println("Press 1 for New Account creation and transaction inquiries");
            System.out.println("Press 2 for loan and other inquiries");
            System.out.println("Press 3 for exit from the call");
            Scanner sa = new Scanner(System.in);
            int opt = sa.nextInt();
            if (opt == 1) {
                System.out.println("you have reached the New Account creation and transaction inquiries");
                break;

            } else if (opt == 2) {
                System.out.println("you have entered the loan and other inquiries");
                break;

            } else if (opt == 3) {
                System.out.println("Exit the call");
                break;
            } else {
                System.out.println("Please enter the valid number or press 3 to exit");
                ;
            }


        }

    }


}
