package com.company;

public class Main {

    public static void main(String[] args) {
        //calling the constructors
        VipCustomer danteCustomer = new VipCustomer("Dante", 5000);
        System.out.println(danteCustomer.getEmail() + " name " + danteCustomer.getName());

        VipCustomer bobCustomer = new VipCustomer("Bob", 5000, "bob@gmail.com");
        System.out.println(bobCustomer.getEmail());

    }
}
