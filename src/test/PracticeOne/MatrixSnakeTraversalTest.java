package test.PracticeOne;

import practiceOne.MatrixSnakeTraversal;
import org.junit.Assert;
import org.junit.Test;


public class MatrixSnakeTraversalTest {

    @Test
    public void testPrint() throws Exception {
        int[][] input = {{1, 2, 3 }, { 4, 5, 6 }, {7, 8, 9} };
        int [] expected = {1, 4, 7, 8, 5, 2, 3, 6, 9};
        MatrixSnakeTraversal matrixSnakeTraversal = new MatrixSnakeTraversal();
        int[] extualResult = matrixSnakeTraversal.print(input);
        Assert.assertEquals(expected, extualResult);

    }
}
/*
[[ 1, 2, 3 ],
        [ 4, 5, 6 ],
        [ 7, 8, 9 ]]
        повернути
        [1, 4, 7, 8, 5, 2, 3, 6, 9]
        */