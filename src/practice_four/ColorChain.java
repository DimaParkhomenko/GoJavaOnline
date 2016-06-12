package practice_four;

/*
Условие:
Дано цепи трёх цветов: белого длиной 1 м, желтого - 2 м и красного - 3 м. Каким количеством способов можно собрать из них цепь длиной N.
Количество цепей каждого цвета считать бесконечным.
Результат задачи: ссылка на задачу, которая успешно прошла все тесты в системе Codegym, загружена как ответ на это задание.
 */
public class ColorChain {
    public int count(int N) {
        int[] results = new int[N + 1];
        results[0] = 1;
        if (N >= 1) results[1] = 1;
        if (N >= 2) results[2] = 2;
        if (N >= 3) results[3] = 4;
        if (N >= 4) results[4] = 7;
        if (N >= 5) {
            for (int i = 5; i <= N; i++) {
                results[i] = results[i - 1] + results[i - 2] + results[i - 3];
            }
        }
        return results[N];
    }
}