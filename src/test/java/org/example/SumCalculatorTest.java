package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    @Test
    public void testSum1() {
        int result = SumCalculator.sum(1);
        assertEquals(1, result, "Сума чисел від 1 до 1 має бути 1");
    }

    @Test
    public void testSum3() {
        int result = SumCalculator.sum(3);
        assertEquals(6, result, "Сума чисел від 1 до 3 має бути 6");
    }

    @Test
    public void testSum0() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> SumCalculator.sum(0));
        assertEquals("The number should be more than 0", exception.getMessage());
    }
}