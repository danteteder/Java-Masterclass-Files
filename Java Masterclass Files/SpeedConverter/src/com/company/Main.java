package com.company;

public class Main {

    public static void main(String[] args) {
	    toMilesPerHour(5);
        printConversion(5);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return  Math.round(kilometersPerHour / 1.609);
        }
        }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "km/h= " + milesPerHour + "mi/h");
        }
    }


}
