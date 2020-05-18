package com.company;

public class Main {

    public static void main(String[] args) {
        //konstruktori pärast lisame instantiasimiel parameetrid mida tahame, needo n nagu setters
        Printer printer = new Printer(5 , 16, true);

        //võib ka manuaalselt lisada
        printer.setNumberOfPages(5);
        printer.setDuplexOrNot(true);
        printer.setTonerLevel(50);

        printer.fillUpToner(30);
        System.out.println(printer.getTonerLevel());

    }
}
