package org.example;
import java.util.Scanner;

public class InputNumber {
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
