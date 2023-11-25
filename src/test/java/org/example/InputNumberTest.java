package org.example;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class InputNumberTest {

    @Test
    public void testInputNumber() {
        String input = "5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        int result = InputNumber.getNumber();

        assertEquals(5, result, "Should return inputted value");
    }

}