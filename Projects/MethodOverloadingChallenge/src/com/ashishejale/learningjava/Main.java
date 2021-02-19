    package com.ashishejale.learningjava;
public class Main {

    public static void main(String[] args) {
        double convertedCentimeter = calcFeetAndInchesToCentimeters(1,0);
        if (convertedCentimeter < 0) {
            System.out.println("Invalid Parameters");
        } else {
            System.out.println("Converted to centimeters : " + convertedCentimeter);
        }
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet >= 0) && (inches >= 0 && inches <= 12)) {
            return calcFeetAndInchesToCentimeters((feet * 12.00d) + inches);
            //calculation
        }
//        System.out.println("Invalid input");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0){
            return (inches * 2.54d);
            //calculation
        }
//        System.out.println("Invalid input.");
        return -1;
    }

}
