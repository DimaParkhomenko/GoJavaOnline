package test.practice_two;

import org.junit.Assert;
import org.junit.Test;
import practice_two.SetZero;

/**
 Дано число. Треба замінити i-й біт замінити на нуль.
 Наприклад:
 для числа 6 в бінарному вигляді 110,
 замінивши 2-й біт на нуль отримаємо 100 тобто 4.
 1<= i <= 32
 */
public class SetZeroTest {
    @Test
    public void set() throws Exception {
     int inputA = 6;
        int inputB = 2;
        int expected = 4;
        SetZero change = new SetZero();
        int extualResult = change.set(inputA, inputB);
        Assert.assertEquals(expected, extualResult);
    }
}