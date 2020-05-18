package com.company;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }


    //RECORDING IF THERES PUT ANY ADDITIONS
    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }
    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }
    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }
    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    //ADDING UP PRICE
    //aka recording base price and go through and check if we've received an additional item

    public double itemizeHamburger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger + on a " + this.breadRollType + "roll " + " price is" + this.price);
        //go through each component and check if theyve been added and if so, add them to the price
        if(this.addition1Name !=null) {
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name + "for an extra " + this.addition1Name);
        }
        if(this.addition2Name !=null) {
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name + "for an extra " + this.addition2Name);
        }
        if(this.addition3Name !=null) {
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name + "for an extra " + this.addition3Name);
        }
        if(this.addition4Name !=null) {
            hamburgerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Name + "for an extra " + this.addition4Name);
        }

        return hamburgerPrice;

    }

}
