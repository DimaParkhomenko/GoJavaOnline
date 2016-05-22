package test.practice_two;

import org.junit.Assert;
import org.junit.Test;
import practice_two.AbcNumber;

/**
 Дано рядок отриманий шляхом заміни цифр 0,1,2,...,9 певного числа на букви a,b,c,..,j.
 Необхідно повернути початкове число маючи конвертований рядок.
 Наприклад:
 Для "bcd" повернути 123
 */
public class AbcNumberTest {

    @Test
    public void testConvert() throws Exception {
        String input = "d";
        int expected = 123;
        AbcNumber change = new AbcNumber();
        int extualResult = change.convert(input);
        Assert.assertEquals(expected, extualResult);
    }
}