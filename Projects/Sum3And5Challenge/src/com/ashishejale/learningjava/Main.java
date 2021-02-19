package com.ashishejale.learningjava;

public class Main {

    public static void main(String[] args) {
        int sumOfNumber = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("Number dividable by both 3 and 5 is :" + i);
                sumOfNumber += i;
                count++;
                if (count == 5) {
                    break;
                }
            }
        }
        System.out.println("Sum of numbers that meet the above criteria = " + sumOfNumber);
    }
}
