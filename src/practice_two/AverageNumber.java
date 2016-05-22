package practice_two;
/*
Знайти середнє значення двох цілих чисел.
Приклади:
average( 4, 6 ) = 5
average( -4, -7 ) = -5
average( -4, 7 ) = 1
 */

public class AverageNumber {
    public static int average(int a, int b) {
        long c = 2;
        long averageNumberFirst = ((long) a + b) / c;
        int averageNumberLast = (int) averageNumberFirst;
        return averageNumberLast;
    }
}

