package com.company;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20,20,5);
        //you buy the case,monitor and motherboard
        Case theCase = new Case("220B", "Dell ", "240", dimensions);
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4,6, "v2.44");

        //now you put together the PC
        //passing those values to the constructor, which is getting the items and putting them together via methods

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.getMonitor().drawPixelAt(1500,200,"Green");
        thePC.getMotherboard().loadPrograms("Windows 1.0");
        thePC.getTheCase().pressPowerButton();

        //monitor,case,motherboard dont make a computer
        //but a computer HAS those things in it, which form it a computer
        //thats composition



    }
}
