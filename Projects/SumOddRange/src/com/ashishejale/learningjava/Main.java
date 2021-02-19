package com.ashishejale.learningjava;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumOdd(10,5));
        int startNumber = 4;
        int endNumber = 20;
        int countEvenNumber = 0;
        while (startNumber <= endNumber) {
            startNumber++;
            if(!isEven(startNumber)) {
                continue;
            }
            countEvenNumber++;
            System.out.println("Number is :" + startNumber);
            if (countEvenNumber >= 5) {
                System.out.println("Total even numbers found :" + countEvenNumber);
                break;
            }
        }
    }
    public static boolean isOdd (int number) {
        if ((number < 0) || (number % 2 == 0)) {
            return false;
        } else {
            return true;
        }
    }

    public static int sumOdd (int start, int end) {
        if ((end < start) || (start < 0)) {
            return -1;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
    public static boolean isEven (int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }
}
