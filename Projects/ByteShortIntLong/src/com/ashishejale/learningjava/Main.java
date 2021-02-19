package com.ashishejale.learningjava;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMaxIntValue = Integer.MAX_VALUE;
        int myMinIntValue = Integer.MIN_VALUE;
        System.out.println("Maximum Integer Value = " + myMaxIntValue);
        System.out.println("Minimum Integer Value = " + myMinIntValue);
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
        System.out.println("Busted Min Value = " + (myMinIntValue - 1));
        int myMaxIntTest = 2147483647;

        byte myMaxByteValue = Byte.MAX_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE;
        System.out.println("Maximum Byte Value = " + myMaxByteValue);
        System.out.println("Minimum Byte Value = " + myMinByteValue);

        short myMaxShortValue = Short.MAX_VALUE;
        short myMinShortValue = Short.MIN_VALUE;
        System.out.println("Maximum Short Value = " + myMaxShortValue);
        System.out.println("Minimum Short Value = " + myMinShortValue);

        long myLongValue = 100L;
        long myMaxLongValue = Long.MAX_VALUE;
        long myMinLongValue = Long.MIN_VALUE;
        System.out.println("Maximum Long Value = " + myMaxLongValue);
        System.out.println("Minimum Long Value = " + myMinLongValue);
        long bigLongLiteralValue = 2_147_483_647_123L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;
        int myTotalIntValue = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);

    }
}
