package practice_three;

/**
 * Найдовший Період Стабільності
 * <p>
 * Дано масив чисел в якому знаходяться значення ВВП за кожен місяць в мільярдах доларів США.
 * Необхідно знайти найдовший період стабільності.
 * Період стабільності - період часу де всі значення ВВП попарно відрізняються один від одного максимум на 1.
 * Повернути кількість місяців.
 */
public class LongestStabilityPeriod {
    public int count(int[] gdp) {
        if (gdp.length == 0) return 0;
        if (gdp.length == 1) return 1;

        int max = 0;

        for (int i = 0; i < gdp.length; i++) {
            int countA = goWithDiff(gdp, i, 1);
            int countB = goWithDiff(gdp, i, -1);
            int count = countA > countB ? countA + 1 : countB + 1;
            if (count > max) max = count;
        }

        return max;
    }

    private int goWithDiff(int[] gdp, int i, int diff) {
        int j;
        int countB = 0;
        j = i + diff;
        int inc = 0;
        while (j >= 0 && j < gdp.length) {
            if (Math.abs(gdp[j] - gdp[i]) > 1) break;
            if (inc == 0) inc = gdp[j] - gdp[i];
            else if (gdp[j] - gdp[i] == -1 * inc) break;
            countB++;
            j += diff;
        }
        return countB;
    }
}
