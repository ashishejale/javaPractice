package com.ashishejale.learningjava;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(3, 2020));
    }

    public static boolean isLeapYear (int year) {
        if (year >= 1 && year <= 9999) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                return true;
            }
        }
        return false;
    }

    public static int getDaysInMonth (int month, int year) {
        if (((month >= 1) && (month <= 12)) && ((year >= 1) && (year < 9999))) {
            switch (month) {
                case 2:
                    if (isLeapYear(year)) {
                        return 29;
                        //break;
                    } else {
                        return 28;
                        //break;
                    }
                case 4: case 6: case 9: case 11:
                    return 30;
                    //break;
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;
                    //break;
            }
        }
        return -1;
    }
}
