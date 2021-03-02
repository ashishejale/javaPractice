package com.ashishejale.learningjava;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRoll;

    public Hamburger(String name, String meat, double price, String breadRoll) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRoll = breadRoll;
        System.out.println(this.name + " hamburger on a " + this.breadRoll +
                        " roll with " + this.meat + ", price is " + this.price);
    }

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;

    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public void addHamburgerAddition1 (String addition1Name, double addition1Price) {
        System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
        this.price += addition1Price;
    }
    public void addHamburgerAddition2 (String addition2Name, double addition2Price) {
        System.out.println("Added " + addition2Name + " for an extra " + addition2Price);
        this.price += addition2Price;
    }
    public void addHamburgerAddition3 (String addition3Name, double addition3Price) {
        System.out.println("Added " + addition3Name + " for an extra " + addition3Price);
        this.price += addition3Price;
    }
    public void addHamburgerAddition4 (String addition4Name, double addition4Price) {
        System.out.println("Added " + addition4Name + " for an extra " + addition4Price);
        this.price += addition4Price;
    }
    public double itemizeHamburger () {
        return (this.price);
    }
}
