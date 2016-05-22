package practice_one;

/**
 * Обійти матрицю "змійкою" і повернути всі числа в одномірному масиві.
 * Наприклад:
 * Для
 * [[ 1, 2, 3 ],
 * [ 4, 5, 6 ],
 * [ 7, 8, 9 ]]
 * повернути
 * [1, 4, 7, 8, 5, 2, 3, 6, 9]
 */
public class MatrixSnakeTraversal {
    public int[] print(int[][] input) {
        if (input.length == 0) return new int[]{};
        int[] simpleArr = new int[input.length * input[0].length];
        int index = 0;
        int i = 0;
        int n = 1;
        for (int j = 0; j < input[0].length; j++) {
            while (i >= 0 && i < input.length) {
                simpleArr[index] = input[i][j];
                index++;
                i += n;
            }
            n = -1 * n;
            i += n;
        }
        return simpleArr;
    }
}
