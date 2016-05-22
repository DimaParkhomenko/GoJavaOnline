package practice_one;

/**
 * Знайти максимальне число в масиві.
 * Гарантується, що масив завжди не пустий.
 */
public class FindMaxNumber {
    public int max(int[] input) {

        int maxNumber = input[0];
        for (int i = 0; i < input.length; i++) {
            if (maxNumber < input[i]) {
                maxNumber = input[i];
            }
        }
        return maxNumber;
    }
}