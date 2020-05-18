package com.company;

public class Main {

    public static void main(String[] args) {

        for(int i = 2; i<9; i++) {
            System.out.println("10.000 at "+ i + "% interest = " + String.format("%.2f",calculateInterest(10000.00, i))) ;
        }

        for(int i = 8; i>1; i--) {
            System.out.println("10.000 at "+ i + "% interest = " + String.format("%.2f",calculateInterest(10000.00, i))) ;
        }

        //sum 3 and 5 challenge
        int count = 0;
        int sum = 0;

        for(int i = 1; i <= 1000; i++){
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println("Found number = " + i);
            }
            if(count == 5){
                break;
            }
        }

        System.out.println("Sum = " + sum);





//        //prime number challenge
//
//        int count = 0;
//        for(int i = 10; i < 50; i++){
//            if(isPrime(i)) {
//                count++;
//                System.out.println("Number " + i " is a prime number");
//                if(count == 10) {
//                    System.out.println("Exiting for loop");
//                    break;
//                }
//            }
//        }
//
//        public static boolean isPrime(int n) {
//            if(n == 1){
//                return false;
//            }
//
//            for (int i=2; i <= n/2; i++) {
//                if((n % i) == 0) {
//                    return false;
//                }
//            }
//
//
//        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }
}
