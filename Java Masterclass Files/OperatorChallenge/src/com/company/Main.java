package com.company;

public class Main {

    public static void main(String[] args) {
        double myFirstDouble = 20.00d;
        double mySecondDouble = 80.00d;
        double doublesTogetherMultiplied = (myFirstDouble + mySecondDouble) * 100;
        double doubleRemainder = doublesTogetherMultiplied % 40.00d;
        boolean doubleChecker = (doubleRemainder == 0) ? true : false;
        System.out.println(doubleChecker);
        if (!doubleChecker) {
            System.out.println("Got some remainder");
        }
        class A {
            int method(int i) {
                return i * i;     //method returning a value
            }
        }
    }
}
