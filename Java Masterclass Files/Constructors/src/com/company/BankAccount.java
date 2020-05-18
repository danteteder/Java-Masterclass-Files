package com.company;

public class BankAccount {
    private int accountNumber = 270007206;
    private int accountBalance = 5129;
    private String customerName = "John Lewis";
    private String customerEmail = "Johnlewis@gmail.com";
    private int customerPhone = 55960157;

    //creating a constructor
    public BankAccount(){
        //calling another constructor from a constructor
        this(596240, 2434, "default name", "default");
        System.out.println("Empty constructor called");
    }

    //you can create another constructor with overflowing aka settings different parameters
    public BankAccount(int accountNumber, int accountBalance, String customerName, String customerEmail) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;

    }

    //default values added 999999 ja 1000 as account number and balance
    public BankAccount(String customerName, String customerEmail, int customerPhone) {
        this(999999, 1000, customerName, customerEmail, customerPhone);
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public void depositFunds(int depositAmount){
        this.accountBalance += depositAmount;
        System.out.println(depositAmount + " has been added to your bank account");
    }

    public void withdrawFunds(int withdrawAmount){
        if(this.accountBalance > withdrawAmount){
            this.accountBalance -= withdrawAmount;
            System.out.println(withdrawAmount + " has been withdrawn from your bank account");
        } else {
            System.out.println("insufficient funds");
        }
    }



    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(int customerPhone) {
        this.customerPhone = customerPhone;
    }


}
