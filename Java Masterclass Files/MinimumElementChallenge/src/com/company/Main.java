package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(readIntegers(5)));
    }

    public static int[] readIntegers(int count){

        Scanner scanner = new Scanner(System.in);
        int[] entries = new int [count];
        for(int i = 0; i < count; i++){
            System.out.println("Please enter an integer");
            entries[i] += scanner.nextInt();
        }
        return entries;
    }










}
