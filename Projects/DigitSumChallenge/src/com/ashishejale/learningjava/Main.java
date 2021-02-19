package com.ashishejale.learningjava;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(12));
    }

    public static int sumDigits (int number) {
        if (number > 10) {
            //process
            int sum = 0;
            while (number > 0) {
                int remainder = number % 10; //extracting remainder for sum
                sum += remainder; // adding remainder to sum
                number /= 10; // removing last significant digit
            }
            return sum;
        }
        return -1;
    }
}