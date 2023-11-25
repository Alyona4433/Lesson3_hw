package org.example;


import org.json.JSONObject;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();

        int userDigit = InputNumber.getNumber();
        System.out.println("You input the number = " + userDigit);

        int sumTotal = SumCalculator.sum(userDigit);
        System.out.println("The sum of numbers from 1 to " + userDigit + " is: " + sumTotal);
    }
}