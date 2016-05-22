package test.practice_one;

import practice_one.FindMaxNumber;
import org.junit.Assert;
import org.junit.Test;

public class FindMaxNumberTest {

    @Test
    public void testMax() throws Exception {
        int[] input = {-6, -2, -3};
        int expected = -2;
        FindMaxNumber findMaxNumber = new FindMaxNumber();
        int extualResult = findMaxNumber.max(input);
        Assert.assertEquals(expected, extualResult);
        System.out.println(extualResult);
    }
}