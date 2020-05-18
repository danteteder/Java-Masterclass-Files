package com.company;

public class VipCustomer {
    private String name;
    private int creditLimit;
    private String email;

    //3 different constructors, 1st is default, 2nd with unknown email and 3rd full
    public VipCustomer(){
        this("default name", 5000, "default@email.com");

    }

    public VipCustomer(String name, int creditLimit){
        this("Dante", creditLimit, "unknown@gmail.com");

    }

    public VipCustomer(String name, int creditLimit, String email){
        System.out.println("Account constructor with 3 parameters is called");
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;

    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
