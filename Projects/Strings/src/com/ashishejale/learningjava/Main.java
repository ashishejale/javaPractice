package com.ashishejale.learningjava;

public class Main {

    public static void main(String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
        String myString = "This is a String.";
        System.out.println("My String is equal to : " + myString);
        myString = myString + " And this is more.";
        System.out.println("My String is equal to : " + myString);
        myString = myString + " \u00A9 2021 ";
        System.out.println("My String is equal to : " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("Number String is : " + numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last String is : " + lastString);
        double doubleNumber = 120.7d;
        lastString = lastString + doubleNumber;
        System.out.println("Last String is : " + lastString);

        
    }
}
