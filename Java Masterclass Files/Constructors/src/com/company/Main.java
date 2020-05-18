package com.company;

import static com.company.BankAccount.*;

public class Main {

    public static void main(String[] args) {
        //creating a new instance but calling the constructor via parameters in new BankAccount
        BankAccount bobsAccount = new BankAccount(53424, 42423, "Bobby", "Bob@gmail.com" );


        BankAccount dantesAccount = new BankAccount("Dante", "asdasd", 52525);
        //these are now redundant
//        bobsAccount.setAccountNumber(53950349);
//        bobsAccount.setAccountBalance(500);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmail("Bob@gmail.com");
//
//
//        bobsAccount.depositFunds(59);
//        bobsAccount.withdrawFunds(5);



;
    }


}
