package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    private SumCalculator calculator = new SumCalculator();

    @BeforeEach
    public void setUp() {
    }

    @Test
    public void testSum1() {
        int result = calculator.sum(1);
        assertEquals(1, result, "Сума чисел від 1 до 1 має бути 1");
    }

    @Test
    public void testSum3() {
        int result = calculator.sum(3);
        assertEquals(6, result, "Сума чисел від 1 до 3 має бути 6");
    }



    @Test
    void getNumber() {
    }

    @Test
    public  int sum(int n) {
        return n;
    }
}