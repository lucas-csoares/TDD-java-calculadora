package test.java.com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.Calculator;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int result = calculator.sum(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.division(15, 5));
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        assertEquals(10.8, calculator.multiplication(4.5, 2.4).doubleValue(), 0.0001);
    }

    @Test
    public void testSquared() {
        Calculator calculator = new Calculator();
        assertEquals(36, calculator.squared(6));
    }

}
