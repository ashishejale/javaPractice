package com.ashishejale.learningjava;

public class Main {

    public static void main(String[] args) {
        int value = 4;
        if (value == 1) {
            System.out.println("Value is 1");
        } else if (value == 2) {
            System.out.println("Value is 2");
        } else {
            System.out.println("Value is not 1 or 2");
        }

        switch (value) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3, 4 or 5.");
                break;
            default:
                System.out.println("Value is not 1 or 2");
                break;
        }

        char alphabet = 'A';
        switch (alphabet) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Found : " + alphabet);
                break;

            default:
                System.out.println("Did not find a capital alphabet.");
                break;
                
        }
    }
}