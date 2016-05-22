package practice_two;

import java.util.ArrayList;

/**
 * Дано 2 числа в системі числення з основою 36. Будь-яка цифра може бути в межах [0-9a-z].
 * Повернути суму чисел, також в системі 36.
 * Наприклад:
 * "9" + "1" = "a"
 * "z" + "1" = "10"
 */
public class AddNumberBase36 {
    public final static int base = 36;

    public String add(String a, String b) {

        return intToBase36(base36ToInt(a) + base36ToInt(b));
    }

    public static int base36ToInt(String str) {


        str = str.toUpperCase();

        int result = 0;
        double frontVal = 0;
        double lastVal = 0;
        int size = str.length();
        boolean started = false;


        frontVal = char36ToInt(str.charAt(0));
        for (int i = 0; i < size; i++) {

            if (i + 1 < size && (started || frontVal > 0.0)) {
                lastVal = char36ToInt(str.charAt(i + 1));
                frontVal = (frontVal + (lastVal / ((double) base))) * ((double) base);
            } else if (!started) {
                if (frontVal == 0.0 && i + 1 < size) {
                    lastVal = char36ToInt(str.charAt(i + 1));
                    if (lastVal > 0.0) {
                        frontVal = lastVal;
                        started = true;
                    }

                }
            }

        }
        result = (int) Math.round(frontVal);
        return result;
    }

    public static String intToBase36(int n) {
        String result = "";
        ArrayList<String> list = new ArrayList<String>();
        int frontVal = 0;
        int lastVal = 0;
        int val = n;
        frontVal = val;

        while (val >= base) {
            frontVal = val / base;
            lastVal = val % base;
            list.add(Character.toString(intToChar36(lastVal)));
            val = frontVal;

        }

        if (frontVal > 0)
            list.add(Character.toString(intToChar36(frontVal)));

        for (int i = list.size() - 1; i >= 0; i--)
            result += list.get(i).toLowerCase();

        return result;
    }

    public static char intToChar36(int n) {

        char result = (char) 0;

        if (n >= 0 && n <= 9)
            result = (char) (48 + n);
        else if (n > 9 && n < base) {
            result = (char) (65 - 10 + n);
        }
        return result;
    }

    public static char intToChar35(int n) {
        char result = (char) 0;
        if (n >= 0 && n <= 9)
            result = (char) (48 + n);
        else if (n > 9 && n < 14) {
            result = (char) (65 - 10 + n);
        } else if (n > 13 && n < 36)
            result = (char) (65 - 10 + n + 1);
        return result;
    }

    public static int char36ToInt(char c) {

        int result = 0;
        if (Character.isDigit(c))
            result = (int) c - 48;
        else if (Character.isAlphabetic(c)) {
            if ((int) c <= 90) {
                result = (int) c - (65 - 10);
            }
        }
        return result;
    }

    public static int char35ToInt(char c) {
        int result = char36ToInt(c);
        if (result > 13)
            result--;
        return result;
    }
}