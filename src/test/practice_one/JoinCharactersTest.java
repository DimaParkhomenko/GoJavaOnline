package test.practice_one;

import practice_one.JoinCharacters;
import org.junit.Assert;
import org.junit.Test;


public class JoinCharactersTest {
    JoinCharacters joinCharacters = new JoinCharacters();

    @Test
    public void testSingleElementArray() throws Exception {
        char[] input = {'1'};
        int expected = 1;

        int extualResult = joinCharacters.join(input);

        Assert.assertEquals("Characters should be joind correctly for single element array.", expected, extualResult);
    }

    @Test
    public void testThreeElementsArray() throws Exception {
        char[] input = {'1', '2', '3'};
        int expected = 123;

        int extualResult = joinCharacters.join(input);
        Assert.assertEquals("Characters should be joind correctly for three elements array.", expected, extualResult);
    }
}