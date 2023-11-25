package org.example;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();

        int userDigit = InputNumber.getNumber();
        System.out.println("You input the number = " + userDigit);

        int sumTotal = SumCalculator.sum(userDigit);
        System.out.println("The sum of numbers from 1 to " + userDigit + " is: " + sumTotal);
    }
}