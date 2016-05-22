package test.practice_two;

import org.junit.Assert;
import org.junit.Test;
import practice_two.AddBinary;

/**
 * Додайте два беззнакових числа, що передаються як рядки.
 * "101" + "100" = "1001"
 */
public class AddBinaryTest {
    @Test
    public void AddBinary() throws Exception {
        String inputA = "101";
        String inputB = "100";
        String expected = "1001";
        AddBinary addBinary = new AddBinary();
        String extualResult = addBinary.add(inputA, inputB);
        Assert.assertEquals(expected, extualResult);
    }

    @Test
    public void AddBinaryLong() throws Exception {
        String inputA = "10000000000000000000000000000000";
        String inputB = "10000000000000000000000000000000";
        String expected = "100000000000000000000000000000000";
        AddBinary addBinary = new AddBinary();
        String extualResult = addBinary.add(inputA, inputB);
        Assert.assertEquals(expected, extualResult);
    }

}