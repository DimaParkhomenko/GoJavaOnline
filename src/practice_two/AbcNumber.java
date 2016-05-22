package practice_two;

/**
 * Дано рядок отриманий шляхом заміни цифр 0,1,2,...,9 певного числа на букви a,b,c,..,j.
 * Необхідно повернути початкове число маючи конвертований рядок.
 * Наприклад:
 * Для "bcd" повернути 123
 */
public class AbcNumber {
    public int convert(String num) {
        String[] alphab = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] codes = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26"};

        String strOut = num;
        for (int i = 0; i < alphab.length; i++) {
            strOut = strOut.replaceAll(alphab[i], codes[i]);
        }
        int finalResult = Integer.parseInt(strOut);
        return finalResult;
    }
}
