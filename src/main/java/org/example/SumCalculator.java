package org.example;

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
}
