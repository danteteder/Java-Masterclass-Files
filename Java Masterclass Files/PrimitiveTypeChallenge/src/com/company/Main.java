package com.company;

public class Main {

    public static void main(String[] args) {
        byte byteValue = (byte) 128;
        short shortValue = (short) 32000;
        int intValue = 1280000;

        long longValue = (long) 50000L + (10 * (byteValue + shortValue + intValue));

        System.out.println(longValue);
    }
}
