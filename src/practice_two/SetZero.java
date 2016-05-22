package practice_two;

/**
 * Дано число. Треба замінити i-й біт замінити на нуль.
 * Наприклад:
 * для числа 6 в бінарному вигляді 110,
 * замінивши 2-й біт на нуль отримаємо 100 тобто 4.
 * 1<= i <= 32
 */
public class SetZero {

    public int set(int num, int i) {
        char[] arr = new char[32];
        for (int index = 0; index < 32; index++) {
            if (index == 32 - i) arr[index] = '0';
            else arr[index] = '1';
        }
        String str = new String(arr);
        Long mask = Long.parseLong(str, 2);
        return num & mask.intValue();
    }
}


/*
String binaryString = Integer.toBinaryString(num);
        char[] chars = binaryString.toCharArray();
        chars[i - 1] = '0';
        String stringNum = String.valueOf(chars);
        int finalResult = Integer.parseInt(stringNum, 2);
        return finalResult;
 */