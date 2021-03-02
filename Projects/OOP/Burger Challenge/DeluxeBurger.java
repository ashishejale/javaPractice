package com.ashishejale.learningjava;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger () {
        super("Deluxe", "Sausage and Bacon", 14.54d, "White");
        super.addHamburgerAddition1("Chips", 2.75d);
        super.addHamburgerAddition2("Drink", 1.81d);
    }

    public void addHamburgerAddition1 (String addition1Name, double addition1Price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
    public void addHamburgerAddition2 (String addition2Name, double addition2Price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
    public void addHamburgerAddition3 (String addition3Name, double addition3Price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
    public void addHamburgerAddition4 (String addition4Name, double addition4Price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}
