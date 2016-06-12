package practice_four;

/**
 * Злиття Цифр
 * З'єднати масив символів в число.
 * Приклад:
 * Для [ '1', '2', '3'] повернути 123
 */
public class JoinCharacters {
    public int join(char[] input) {
        String s = new String(input);
        return Integer.parseInt(s);
    }
}