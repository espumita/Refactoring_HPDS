package case3;

import static case3.Range.from;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void should_be_able_to_sum_numbers() {
        Calculator calculator = new Calculator();
        assertEquals(55, calculator.sum(from(1).to(10)));
    }
    @Test
    public void should_be_able_to_sum_square_numbers() {
        Calculator calculator = new Calculator();
        assertEquals(385, calculator.sumOfSquares(from(1).to(10)));
    }


}
