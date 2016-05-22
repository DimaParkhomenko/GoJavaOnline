package test.practice_two;

import org.junit.Assert;
import org.junit.Test;
import practice_two.AverageNumber;

/**
 Знайти середнє значення двох цілих чисел.
 Приклади:
 average( 4, 6 ) = 5
 average( -4, -7 ) = -5
 average( -4, 7 ) = 1
 */
public class AverageNumberTest {
    @Test
    public void testAverage() throws Exception {
        int inputA = 1073741824;
        int inputB = 1073741824;
        int expected = 1073741824;
        AverageNumber averageNumber = new AverageNumber();
        int extualResult = averageNumber.average(inputA,inputB);
        Assert.assertEquals(expected, extualResult);
    }
}