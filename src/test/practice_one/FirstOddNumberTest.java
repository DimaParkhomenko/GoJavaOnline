package test.practice_one;

import practice_one.FirstOddNumber;
import org.junit.Assert;
import org.junit.Test;

public class FirstOddNumberTest {
    @Test
    public void testFind() throws Exception {
        int[] input = {};
        int expected = -1;
        FirstOddNumber firstOddNumber = new FirstOddNumber();
        int extualResult = firstOddNumber.find(input);
        Assert.assertEquals(expected, extualResult);
        System.out.println(extualResult);
    }
}