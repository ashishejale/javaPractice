package com.ashishejale.learningjava;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Carpet carpet = new Carpet(3.5d);
        Floor floor = new Floor(2.75d,4.0d);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("Total Cost = " + calculator.getTotalCost());
    }
}
