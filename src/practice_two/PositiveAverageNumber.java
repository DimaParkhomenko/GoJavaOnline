package practice_two;

/**
 * Знайти середнє арифметике двух додатніх чисел.
 * Наприклад:
 * average( 2, 4 ) = 3
 * average( 4, 7 ) = 5
 */
public class PositiveAverageNumber {
    public static int average(int a, int b) {
        long c = 2;
        long a1 = a;
        long b1 = b;
        long averageNumberFirst = (a1 + b1) / c;
        int averageNumberLast = (int) averageNumberFirst;
        return averageNumberLast;
    }
}

/*
 BigInteger c = BigInteger.valueOf(2);
        BigInteger a1 = BigInteger.valueOf(a);
        BigInteger b1 = BigInteger.valueOf(b);
        BigInteger sum = a1.add(b1);
        BigInteger averageNumberFirst = sum.divide(c);

        int averageNumberLast = averageNumberFirst.intValue();
 */