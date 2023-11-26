package org.example;

public class Main {
    public static void main(String[] args) {

        int userDigit = InputNumber.getNumber();
        System.out.println("You input the number = " + userDigit);

        int sumTotal = SumCalculator.sum(userDigit);
        System.out.println("The sum of numbers from 1 to " + userDigit + " is: " + sumTotal);
    }
}