package edu.hit.lab4;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SumTwoNumberTest {

    @Test
    public void testSumPositive() {
        SumTwoNumber s = new SumTwoNumber();
        assertEquals(5, s.sum(2, 3));
    }

    @Test
    public void testSumNegative() {
        SumTwoNumber s = new SumTwoNumber();
        assertEquals(-5, s.sum(-2, -3));
    }
}
