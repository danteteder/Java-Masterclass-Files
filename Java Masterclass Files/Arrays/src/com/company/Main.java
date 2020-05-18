package com.company;

public class Main {


    public static void main(String[] args) {
        //regular variable
        double[] myDoubleArray = new double[10];

        for(double i = 0; i < myDoubleArray.length; i++){
            myDoubleArray[(int) i] = i*5.50;
            System.out.println("Element " + i + " value is " + myDoubleArray[(int) i]);
        }
        
    }
}
