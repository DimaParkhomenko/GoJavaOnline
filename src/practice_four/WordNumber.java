package practice_four;

import java.util.Arrays;
import java.util.List;

/**
 * Злічити Слова
 * <p>
 * Дано рядок. Порахувати кількість слів.
 * Словом вважається послідовність символів англійського алфавіту [a-zA-Z].
 * <p>
 * Алгоритм повинен працювати за O(N) часу, тому RegExp використовувати не можна.
 */
public class WordNumber {
    public int count(String input) {
        input = input.toLowerCase();
        System.out.println(input);
        char[] inputsChar = input.toCharArray();
        int res = 0;
        boolean word = false;
        for (char c : inputsChar) {
            if (c >= 'a' && c <= 'z') {
                word = true;
            } else if (word) {
                word = false;
                res++;
            }
        }
        if (word) res++;
        return res;
    }
}