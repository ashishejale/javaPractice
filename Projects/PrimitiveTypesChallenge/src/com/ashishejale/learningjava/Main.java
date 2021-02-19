package com.ashishejale.learningjava;

public class Main {

    public static void main(String[] args) {

        byte numB = 10;
        short numS = 20;
        int numI = 50;
        long numL = 50000L + 10L *  (long) (numB + numS + numI);
        System.out.println("Long number is = " + numL);

        short shortTotal = (short) (10000 + 10 * (numB + numS + numI));
        System.out.println("Short number is = " + shortTotal);

    }
}
