package test.PracticeTwo;

import org.junit.Assert;
import org.junit.Test;
import practiceTwo.PositiveAverageNumber;

import static org.junit.Assert.*;

/**
 Знайти середнє арифметике двух додатніх чисел.
 Наприклад:
 average( 2, 4 ) = 3
 average( 4, 7 ) = 5
 */
public class PositiveAverageNumberTest {
    @Test
    public void testAverage() throws Exception {
        int inputA = 1073741824;
        int inputB = 1073741824;
        int expected = 1073741824;
        PositiveAverageNumber averageNumber = new PositiveAverageNumber();
        int extualResult = averageNumber.average(inputA,inputB);
        Assert.assertEquals(expected, extualResult);
    }
}