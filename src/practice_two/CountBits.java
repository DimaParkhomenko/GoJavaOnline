package practice_two;

/**
 * Для даного числа порахувати кількість біт.
 * Наприклад:
 * Для числа 13 в бінарному вигляді 1101 повернути 3.
 */
public class CountBits {
    public int count(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = num & (num - 1);
        }
        return count;
    }
}