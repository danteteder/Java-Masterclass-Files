package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int counter = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while(counter < 11){
            System.out.println("Enter a number #" + counter);
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                System.out.println("You have entered " + number);
            } else {
                System.out.println("invalid number");
            }





        }

        System.out.println("Sum is " + sum);
        scanner.close();










    }
}
