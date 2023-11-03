package com.solvd.laba.bankproject;

public class MainProcess {

    public static void main(String[] args) {
        Customer customers = new Customer("John",233333,5000, 500000);
        Customer customers1 = new Customer("Jack",343434,600,78980);
        System.out.println();
        customers.createaccount();
        customers.deposit();
        customers.currentbalance();
        customers.withdraw();

        NetBanking netbanking1 = new NetBanking();
        netbanking1.isValidaccount();
        netbanking1.transfer(343434,3000,50000);

        netbanking1.currdate();

        CustomerCare number = new CustomerCare();
        System.out.println();
        System.out.println("If you face problem in transaction and other general inquiry,call customercare");
        CustomerCare.setCustomercarenumber(1800585858);
        number.options();
        System.out.println();

        AccountType accounttype = new AccountType();
        accounttype.calculateinterest();
        System.out.println();

        AtmTransaction transaction = new AtmTransaction(500000,300);
        transaction.checkbalance();
        transaction.withdraw();
        System.out.println();

        FrontOfficeOperations operations = new FrontOfficeOperations(2222,"s2323",5000);
        operations.checkdeposit();

        LoanSection loan = new LoanSection();
        System.out.println();
        System.out.println("Interest calculation for loan " );
        loan.housingloan();
        loan.personalloan();

        StockAndInvestment stocks = new StockAndInvestment(130,10);
        stocks.buystock();

        GlobalBanking banking = new GlobalBanking("Neenah","7th street,wisconsin","USA",2333333,556);
        System.out.println("Location :" +banking.branchname +  " " + banking .branchaddress + " "+ banking .country + " " + banking.routingnumber+ " " + banking.branchcode);






















    }
}
