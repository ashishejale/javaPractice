package com.ashishejale.learningjava;

public class Main {

    public static void main(String[] args) {
        float myFloatMinValue = Float.MIN_VALUE;
        float myFloatMaxValue = Float.MAX_VALUE;
        System.out.println("Float Max Value = " + myFloatMaxValue);
        System.out.println("Float Min Value = " + myFloatMinValue);

        double myDoubleMinValue = Double.MIN_VALUE;
        double myDoubleMaxValue = Double.MAX_VALUE;
        System.out.println("Double Max Value = " + myDoubleMaxValue);
        System.out.println("Double Min Value = " + myDoubleMinValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue  = 5d / 3d;
        System.out.println("Int value = " + myIntValue);
        System.out.println("Float value = " + myFloatValue);
        System.out.println("Double value = " + myDoubleValue);

        double pounds = 200d;
        double kilogram = 0.45359237d * pounds;
        System.out.println("Converted Kilograms = " + kilogram);

    }
}
