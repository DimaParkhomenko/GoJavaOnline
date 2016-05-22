package test.practice_one;

import practice_one.SumDigits;
import org.junit.Assert;
import org.junit.Test;

public class SumDigitsTest {
    @Test
    public void testSum() throws Exception {
        int input = -256;
        int expected = 13;
        SumDigits sumDigits = new SumDigits();
        int extualResult = sumDigits.sum(input);
        Assert.assertEquals(expected, extualResult);
        System.out.println("Sum numbers in number " + input + " is " + extualResult + ".");
    }
}
