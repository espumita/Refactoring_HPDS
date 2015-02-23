package case3;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testSumRange() {
        Calculator calculator = new Calculator();
        assertEquals(55, calculator.sum(1,10));
        assertEquals(385, calculator.sumOfSquares(1,10));
    }

}
