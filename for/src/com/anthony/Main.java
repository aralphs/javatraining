package com.anthony;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.out.println("10,000 at 2% interest = "  + calculateInterest(10000.0, 2.0));

        for (int i =2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        System.out.println("==============================");

        for (int k =8; k >= 2 ; k--) {
            System.out.println("10,000 at " + k + "% interest = " + String.format("%.2f",calculateInterest(10000.0, k)));
        }

        System.out.println("==============================");
        int count = 0;
        for (int i = 1; i < 50; i++) {
            if (isPrime(i)){
                System.out.println(i + " is a prime number");
                count++;
                if(count == 3 ) {
                    System.out.println("Exiting for loop, found 3 prime numbers");
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        for (int i=2; i <= (long) Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
