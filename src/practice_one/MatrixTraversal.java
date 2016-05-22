package practice_one;

/*Обійти матрицю по спіралі і записати всі числа в одмірний масив.
        Для матриці
        [[1,   2,  3,  4],
        [5,   6,  7,  8]
        [9,  10, 11, 12]
        [13, 14, 15, 16]]
        вивести [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]
*/
public class MatrixTraversal {
    public int[] print(int[][] input) {

        int m = input.length;
        int n = input[0].length;
        int[] matrix = new int[m * n];
        int x = 0;
        int y = 0;
        int index = 0;
        while (m > 0 && n > 0) {
            if (m == 1) {
                for (int i = 0; i < n; i++) {
                    matrix[index] = input[x][y++];
                    index++;
                }
                break;
            } else if (n == 1) {
                for (int i = 0; i < m; i++) {
                    matrix[index] = input[x++][y];
                    index++;
                }
                break;
            }
            for (int i = 0; i < n - 1; i++) {
                matrix[index] = input[x][y++];
                index++;
            }
            for (int i = 0; i < m - 1; i++) {
                matrix[index] = input[x++][y];
                index++;
            }
            for (int i = 0; i < n - 1; i++) {
                matrix[index] = input[x][y--];
                index++;
            }
            for (int i = 0; i < m - 1; i++) {
                matrix[index] = input[x--][y];
                index++;
            }
            x++;
            y++;
            m = m - 2;
            n = n - 2;
        }
        return matrix;
    }

}

