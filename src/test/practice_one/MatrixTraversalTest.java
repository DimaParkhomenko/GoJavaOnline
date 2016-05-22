package test.practice_one;
/*Обійти матрицю по спіралі і записати всі числа в одмірний масив.
        Для матриці
        [[1,   2,  3,  4],
        [5,   6,  7,  8]
        [9,  10, 11, 12]
        [13, 14, 15, 16]]
        вивести [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]
*/

import org.junit.Assert;
import org.junit.Test;
import practice_one.MatrixTraversal;

public class MatrixTraversalTest {

    MatrixTraversal matrixTraversal = new MatrixTraversal();

    @Test
    public void testPrint() throws Exception {
        int[][] input = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        int[] expected = {1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10};
        int[] extualResult = matrixTraversal.print(input);
        Assert.assertArrayEquals(expected, extualResult);
    }
}

