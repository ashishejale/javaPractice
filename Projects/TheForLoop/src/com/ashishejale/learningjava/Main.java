package com.ashishejale.learningjava;

public class Main {

    public static void main(String[] args) {
	 for (int i = 2; i < 9; i++) {
         System.out.println("10,000 at " + i + " % interest rate = "
                            + String.format("%.2f",calculateInterest(10000.00d, i)));
     }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    for (int i = 8; i > 1; i--) {
        System.out.println("10,000 at " + i + " % interest rate = "
                + String.format("%.2f",calculateInterest(10000.00d, i)));
    }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++=+++++");


        int count = 0;
        for (int j = 10; j < 50; j++) {
            if(isPrime(j)) {
                  System.out.println("prime number " + j);
                  count++;
                if (count == 10){
                    System.out.println("Exiting loop");
                    break;
                  }
            }
        }

}

    public static double calculateInterest (double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            System.out.println("Looping " + i);
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
