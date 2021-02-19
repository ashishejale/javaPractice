package com.ashishejale.learningjava;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("Previous result is : " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("Previous result is : " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the remainder of (4 / 3) ie 1
        System.out.println("4 % 3 = " + result);

        //result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        //result = result - 1;
        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        //result = result + 2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        //result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        //result = result / 3;
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        //result = result - 2;
        result -= 2; // 10 - 2 = 1
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien.");
            System.out.println("And I am scared of aliens!");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the High score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Top score is greater than second top score but less than 100. ");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true.");
        }

        int newvalue = 50;
        if (newvalue == 50) {
            System.out.println("This is true!");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen.");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true.");
        }

        double firsrNumber = 20.00d;
        double secondNumber = 80.00d;
        double challengeResult = (firsrNumber + secondNumber) * 100.00d;
        System.out.println("My values total = " + challengeResult);
        double remainder = challengeResult % 40.00d;
        System.out.println("Remainder is = " + remainder);
        boolean isNoRemainder = (remainder == 0) ? true : false;
        System.out.println("Boolean isNoRemainder value is : " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder.");
        }

    }
}
