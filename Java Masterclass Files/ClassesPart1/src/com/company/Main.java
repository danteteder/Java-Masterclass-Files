package com.company;

public class Main {

    public static void main(String[] args) {
        //Creating an object of type Car, called porsche
        Car porsche = new Car();
        Car volkswagen = new Car();

        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());


    }
}
