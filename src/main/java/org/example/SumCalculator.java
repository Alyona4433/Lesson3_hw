package org.example;

import java.util.Scanner;

public class SumCalculator {

    public static void testSumWithZero(int n) {
        if (n<=0) {
            throw new IllegalArgumentException("The number should be more than 0");
        }
    }

    public static int sum (int n){
        if (n<=0) {
            throw new IllegalArgumentException("The number should be more than 0");
        }


    int result = 0;
       for (int i=1; i<=n;i++) {
           result += i;
       }
       return result;

    }

    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);

        int n = -1;

        while(n <0) {
            try {
                System.out.println("Enter any number: ");
                n = scanner.nextInt();
            } catch (NumberFormatException e) {
                System.out.println("Please enter valid input value = ");
                scanner.nextLine();
            }
        } return n;
    }
}
