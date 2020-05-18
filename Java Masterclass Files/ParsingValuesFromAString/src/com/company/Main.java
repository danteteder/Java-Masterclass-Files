package com.company;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2020";
        System.out.println("numberAsString = " + numberAsString);

        //convert a string into a number by parsing
        int number = Integer.parseInt(numberAsString);
        System.out.println("number " + number);

        numberAsString += 1;
        number +=1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);
    }
}
