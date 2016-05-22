package test.practice_one;

import practice_one.MatrixSnakeTraversal;
import org.junit.Assert;
import org.junit.Test;


public class MatrixSnakeTraversalTest {

    MatrixSnakeTraversal matrixSnakeTraversal = new MatrixSnakeTraversal();


    @Test
    public void testPrintForSquareMatrix() throws Exception {
        int[][] input = {{1, 2, 3},
                         {4, 5, 6},
                         {7, 8, 9}};

        int[] expected = {1, 4, 7, 8, 5, 2, 3, 6, 9};
        int[] extualResult = matrixSnakeTraversal.print(input);
        Assert.assertArrayEquals(expected, extualResult);

    }


}
