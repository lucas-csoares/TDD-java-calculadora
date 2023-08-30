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
    @Displayname("Division test")
    public void testDivision() {
        Calculator calculator = new Calculator();
        asserEquals(2, calculator.division(10,5));
    }

}
