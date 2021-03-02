package com.ashishejale.learningjava;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hamburger hamburger = new Hamburger("Basic", "Sausage",
                                            3.56d, "White");

        hamburger.addHamburgerAddition1("Tomato", 0.27d);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13d);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());
        System.out.println("================================================");

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition1("Try adding Mayo", 10);
        System.out.println("Total Deluxe Burger price is " + deluxeBurger.itemizeHamburger());
        System.out.println("================================================");

        HealthyBurger healthyBurger = new HealthyBurger("bacon", 5.67d);
        healthyBurger.addHealthyAddition1("Eggs", 5.43);
        healthyBurger.addHealthyAddition2("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());
        System.out.println("================================================");

    }
}
